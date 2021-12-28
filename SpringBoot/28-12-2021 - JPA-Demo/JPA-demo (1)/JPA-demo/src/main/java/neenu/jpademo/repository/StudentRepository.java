package neenu.jpademo.repository;

import neenu.jpademo.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

//Controller-------Service--------Repository------------->Database
public interface StudentRepository extends JpaRepository<Students,Long> {

}
