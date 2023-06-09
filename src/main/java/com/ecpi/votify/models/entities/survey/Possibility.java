package com.ecpi.votify.models.entities.survey;

import com.ecpi.votify.models.entities.User;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@Entity
@EqualsAndHashCode(callSuper = false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Possibility extends User {

    @Id
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "surveyid", insertable = false, updatable = false)
    private Survey survey;

}
