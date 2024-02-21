package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Registration;
import com.example.demo.repository.RegistrationRepo;

@Service
public class RegistrationService {
    @Autowired
    RegistrationRepo registrationRepo;

    public Registration addRegistration(Registration registration)
    {
        return registrationRepo.save(registration);
    }
    public List<Registration> getRegistration()
    {
        return registrationRepo.findAll();
    }
    public Optional<Registration> f1(Long id)
    {
        return registrationRepo.findById(id);
    }
    public String deleteRegistration(Long id)
   {
       registrationRepo.deleteById(id);
       return(" Successfully Deleted");
   }
   public Registration editRegistration(Long id,Registration registration)
    {
        Registration RegistrationAvail = registrationRepo.findById(id).orElse(null);
        if(RegistrationAvail !=null)
        {    
            RegistrationAvail.setFirstName(registration.getFirstName());
            RegistrationAvail.setLastName(registration.getLastName());
            RegistrationAvail.setEmail(registration.getEmail());
            RegistrationAvail.setPassword(registration.getPassword());
            RegistrationAvail.setPhoneNumber(registration.getPhoneNumber());
            RegistrationAvail.setAddress(registration.getAddress());
            RegistrationAvail.setGender(registration.getGender());
            RegistrationAvail.setLocation(registration.getLocation());
            RegistrationAvail.setDistrict(registration.getDistrict());
             return registrationRepo.saveAndFlush(RegistrationAvail);
        }
        else
        return null;
    }
}
