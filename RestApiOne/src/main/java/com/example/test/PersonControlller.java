package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/webapione")
public class PersonControlller {

    @SuppressWarnings("rawtypes")
	@Autowired
    PersonService personService;
    
    @SuppressWarnings("unchecked")
	@RequestMapping("/person/{personId}")
    public <PersonResonse> PersonResonse getPerson(@PathVariable int personId){
        return (PersonResonse) personService.getPerson(personId);
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/person")   
    public void addPerson(@RequestBody PersonEntity pe ) {
        personService.addPerson(pe);
    }
}
