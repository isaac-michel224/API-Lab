package com.tts.UsersAPI.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EndUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Long id;
    @Length(max = 20, message = "maximum of 20 characters for the First Name")
    public String FirstName;
    @Length(min = 2, message = "minimum of 2 characters in length")
    public String LastName;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    @Length(min = 4, message = "minimum of 4 characters in length")
    @Length(max = 20, message = "maximum of 20 characters in length")
    public String State;
}
