package org.acme.kogito.services;
import javax.enterprise.context.ApplicationScoped;

import org.acme.kogito.model.Person;


@ApplicationScoped
public class ProcessUserTask {

    public boolean verifyIfPersonIsAdult(Person person) {
        if (person.getAge() >= 18) person.setAdult(true);
        else person.setAdult(false);
        
        return person.isAdult();
    }
    
}
