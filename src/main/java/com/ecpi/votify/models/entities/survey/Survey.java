package com.ecpi.votify.models.entities.survey;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Survey {

    @Id
    private UUID id;

    private String description;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate startingDate;

    private LocalTime startingTime;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate endingDate;

    private LocalTime endingTime;

}
