package uz.java.oop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.java.oop.entity.Person;
import uz.java.oop.model.PersonForm;
import uz.java.oop.repostory.PersonRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

//    private static List<Person> persons = new ArrayList<Person>();
//
//    static {
//        persons.add(new Person("Bill", "Gates"));
//        persons.add(new Person("Steve", "Jobs"));
//    }

    @Autowired
    private PersonRepository personRepository;

    // Inject via application.properties
    @Value("${welcome.message}")
    private String message;

    @Value("${error.message}")
    private String errorMessage;

//    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    @GetMapping(value = { "/", "/index" })
    public String index(Model model) {

        model.addAttribute("message", message);

        return "index";
    }

//    @RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
    @GetMapping(value = { "/personList" })
    public String personList(Model model) {

//        model.addAttribute("persons", persons);
        model.addAttribute("persons", personRepository.findAll());

        return "personList";
    }

//    @RequestMapping(value = { "/addPerson" }, method = RequestMethod.GET)
    @GetMapping(value = { "/addPerson" })
    public String showAddPersonPage(Model model) {

        PersonForm personForm = new PersonForm();
        model.addAttribute("personForm", personForm);

        return "addPerson";
    }

//    @RequestMapping(value = { "/addPerson" }, method = RequestMethod.POST)
    @PostMapping(value = { "/addPerson" })
    public String savePerson(Model model, @ModelAttribute("personForm") PersonForm personForm) {

        String firstName = personForm.getFirstName();
        String lastName = personForm.getLastName();

        if (firstName != null && firstName.length() > 0 //
                && lastName != null && lastName.length() > 0) {
            Person newPerson = new Person(firstName, lastName);
//            persons.add(newPerson);
            personRepository.save(newPerson);

            return "redirect:/personList";
        }

        model.addAttribute("errorMessage", errorMessage);
        return "addPerson";
    }

}