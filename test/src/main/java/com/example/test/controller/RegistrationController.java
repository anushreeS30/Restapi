package com.example.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.model.Registration;
import com.example.test.service.RegistrationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class RegistrationController {
    @Autowired
    RegistrationService registrationService;

    @PostMapping("/reg")
    public Registration addRegistration(@RequestBody Registration reg) {
    
        return registrationService.addRegistration(reg);
    }
    
    @GetMapping("/reg")
    public List<Registration> getRegistrations() {
        return registrationService.getRegistration();
    }
    @GetMapping("/reg/{id}")
    public Optional<Registration> f1(@PathVariable Long id) {
        return registrationService.f1(id);
    }
    @DeleteMapping("/reg/{id}")
    public String deleteRegistration(@PathVariable Long id)
    {
        return registrationService.deleteRegistration(id);
    }
    @PutMapping("/reg/{id}")
    public Registration editRegistration(@PathVariable Long id, @RequestBody Registration registration) {
        
        
        return registrationService.editRegistration(id,registration);
    }
    @GetMapping("/path1/{pageNumber}/{pagesize}")
    public List<Registration> getpage(@PathVariable int pageNumber,@PathVariable int pagesize)
    {
        return registrationService.page(pageNumber,pagesize);
    }
    @GetMapping("/path2/{field}")
    public List<Registration> getsort(@PathVariable String field)
    {
        return registrationService.sort(field);
    }
    @GetMapping("/path3/{pageNumber}/{pageSize}/{field}")
    public List<Registration> getpagesort(@PathVariable int pageNumber,@PathVariable int pageSize,@PathVariable String field)
    {
        return registrationService.getpagesort(pageNumber,pageSize,field);
    }
}
