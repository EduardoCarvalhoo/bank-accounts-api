package com.bank.accounts.domain.entities;

import com.bank.accounts.data.models.UserRequestModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "bankAccounts")
@Entity(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String document;
    private String number;


    public User(UserRequestModel data) {
        this.name = data.name();
        this.document = data.document();
        this.number = data.number();
    }
}
