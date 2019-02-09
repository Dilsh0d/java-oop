package uz.java.oop.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.java.oop.entity.Person;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
