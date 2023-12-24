package ru.theinlaoq.test.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.theinlaoq.test.entity.Employee;

@RestController
public class MainController {
    @Autowired
    private ObjectMapper objectMapper;

    //simple get method controller
    @GetMapping("/api/main")
    public String mainListener(){
        return "Hello postman!";
    }

    @GetMapping("/api/employee")
    public String sendEmployee(){
        Employee employee1 = new Employee("Alex", "Milekov", 20);
        String jsonEmployee1 = null;
        try {
            jsonEmployee1 = objectMapper.writeValueAsString(employee1);
        } catch (JsonProcessingException e) {
            System.out.println("error with serialization");
        }
        return jsonEmployee1;
    }


    @PostMapping("/api/spl/employee")
    public String sendSpecialEmployee(@RequestParam String surname){
        Employee employee1 = new Employee("Alex", surname, 20);
        String jsonEmployee1 = null;
        try {
            jsonEmployee1 = objectMapper.writeValueAsString(employee1);
        } catch (JsonProcessingException e) {
            System.out.println("error with serialization");
        }
        return jsonEmployee1;
    }

}


