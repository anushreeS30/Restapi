package com.example.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.test.model.Registration;
import com.example.test.repository.RegistrationRepo;

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
    public List<Registration> page(int pageNumber,int pageSize)
    {
      Pageable pages=PageRequest.of(pageNumber,pageSize);
      return registrationRepo.findAll(pages).getContent();
    }
    public List<Registration> sort(String field)
    {
      Sort sort=Sort.by(Sort.Direction.ASC,field);
      return registrationRepo.findAll(sort);
    }
    public List<Registration> getpagesort(int pageNumber,int pageSize,String field)
    {
      return registrationRepo.findAll(PageRequest.of(pageNumber,pageSize).withSort(Sort.by(Sort.Direction.ASC,field))).getContent();
    }
}
