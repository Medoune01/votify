package com.ecpi.votify.services;

import com.ecpi.votify.models.entities.survey.Choice;
import com.ecpi.votify.repositories.ChoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChoiceService {

    @Autowired
    private ChoiceRepository choiceRepository;


    public List<Choice> getAllChoices(){
        return choiceRepository.findAll();
    }

    public void save(Choice choice){
        choiceRepository.save(choice);
    }

}
