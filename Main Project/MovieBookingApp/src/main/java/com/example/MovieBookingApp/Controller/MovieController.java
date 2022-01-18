package com.example.MovieBookingApp.Controller;

import com.example.MovieBookingApp.Entity.*;
import com.example.MovieBookingApp.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Controller
public class MovieController {

    static int showId;
    static int movieid;
    public List<String> seatlist = new ArrayList<String>();


    @Autowired
    private TheatreService tservice;
    @Autowired
    MovieService service;
    @Autowired
    ShowsService sservice;
    @Autowired
    SeatService seatservice;
    @Autowired
    TheatreSeatService theatreSeatService;
    @Autowired
    HomeController homeController;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private PaymentService paymentService;
    @Autowired
    private BookedService bookedService;
    @Autowired
    private HistoryService historyService;


    @RequestMapping("/Allmovies")
    public String listAllMovies(Model model) {
        model.addAttribute("movie", service.listAll());
        return "Home";
    }

    @RequestMapping("/Home")
    public String Home(HttpServletRequest request) {
        return "Home";
    }

    @RequestMapping("/Login")
    public String login() {
        return "Login";
    }

    @GetMapping("/MovieDetails/{mid}")
    public String movieDetails(@PathVariable("mid") int mid, Model model) {
        model.addAttribute("movie", service.findMovieDetails(mid));
        model.addAttribute("theatres", tservice.allTheatres());
        model.addAttribute("shows", sservice.getShowsByMovieId(mid));

        return "MovieDetails";
    }

    @RequestMapping("/TheaterDetails/{mid}")
    public String theatreDetails(@PathVariable("mid") int mid, Model model) {
        model.addAttribute("shows", sservice.getShowsByMovieId(mid));
        movieid = mid;
        return "TheaterDetails";
    }

    @RequestMapping("/SeatBooking/{showid}")
    public String seatBookingDetails(@PathVariable("showid") int showid, Model model) {
        showId = showid;
        model.addAttribute("showid", showid);
        model.addAttribute("seat", theatreSeatService.getSeatsByTheatreId(sservice.getById(showid).getTheatre().getTid()));
        return "SeatBooking";
    }

    @RequestMapping("/PaymentInfo")
    public String payment(HttpServletRequest request, Model model) {
        seatlist.clear();
        String bookedSeats = request.getParameter("bookedSeats");
        String[] seats = bookedSeats.split(",");
        for (String seat : seats) {
            int seatId = Integer.parseInt(seat);
            BookedSeat bookedTickets = bookedService.getBookedSeatByShowIdAndSeatId(showId, seatId);
            if (!(Objects.isNull(bookedTickets))) {
                model.addAttribute("message", "Seat is already booked, Please choose another seat");
                return "SeatBooking";
            }
        }
        model.addAttribute("seats", bookedSeats);
        seatlist.add(bookedSeats);
        for (String seat : seats) {
            int seatId = Integer.parseInt(seat);
            BookedSeat bookedSeat = bookedService.getBookedSeatByShowIdAndSeatId(showId, seatId);
            BookedSeat bookedSeat1 = new BookedSeat(showId, seatId, HomeController.customerid);
            bookedService.saveTicket(bookedSeat1);
        }
        Double amount = 0.0;
        for (String seat : seats) {
            int seatid = Integer.parseInt(seat);
            if (theatreSeatService.getSeatById(seatid).getType() == 1) {
                amount = amount + 250.0;
            } else if (theatreSeatService.getSeatById(seatid).getType() == 2) {
                amount = amount + 150.0;
            } else if (theatreSeatService.getSeatById(seatid).getType() == 3) {
                amount = amount + 100.0;
            } else {
                System.out.println("Invalid seat ");
            }
        }
        model.addAttribute("amount", amount);
        model.addAttribute("seatCount", seats.length);
        model.addAttribute("showDetails", sservice.getById(showId));
        model.addAttribute("seatlist", seats);
        Customer customer = customerService.findById(HomeController.customerid);
        TheatreShow theatreShow = sservice.getById(showId);
        History history = new History(customer.getname(), theatreShow.getTheatre().getTname(), theatreShow.getStarttime(), theatreShow.getMovie().getReldate(), seats.length, bookedSeats, amount, theatreShow.getMovie().getMname());
        historyService.saveHistory(history);

        return "PaymentInfo";

    }

    @PostMapping("/Payment")
    public String paymentInfo(HttpServletRequest request) {
        Payment payment = new Payment(Double.parseDouble(request.getParameter("amount")),
                sservice.getById(Integer.parseInt(request.getParameter("id"))), customerService.findById(getCustomer().getId()));
        paymentService.savePayment(payment);
        return "Payment";
    }

    public Customer getCustomer() {
        return homeController.getCustomer;
    }

    @RequestMapping("/TicketDetails")
    public String ticketDetails(Model model) {
        model.addAttribute("customername", (customerService.findById(HomeController.customerid).getname()));
        model.addAttribute("date", (sservice.getById(showId)).getDate());
        model.addAttribute("showtime", (sservice.getById(showId)).getStarttime());
        model.addAttribute("moviename", (service.findMovieDetails(movieid)).getMname());
        model.addAttribute("seatlist", seatlist);

        return "TicketDetails";
    }

    @RequestMapping("/Status")
    public String status() {
        return "Status";
    }


    @RequestMapping("/MyBookings")
    public String history(Model model) {
        Customer customer = customerService.findById(HomeController.customerid);
        List<History> histories = historyService.getHistoryByUserName(customer.getname());
        model.addAttribute("histories", histories);
        return "MyBookings";
    }


}

