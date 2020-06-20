package com.jam.example.paymentservice.entities;

import com.jam.example.paymentservice.entities.base.AbstractEntityNoGen;
import grpc.BDecimal;
import grpc.UUID;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "uzer")
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class User extends AbstractEntityNoGen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected UUID user_id;

    @NotNull
    private String password;

    @NotNull
    private String firstName;

    @NotNull
    private BDecimal balance;

    public User(String firstName, String password) {
        this.firstName = firstName;
        this.password = password;
    }


    //    @OneToMany(fetch = FetchType.LAZY )
//    @JoinTable(name = "user_cards",
//            joinColumns = @JoinColumn(name = "user_id"))
//    private Collection<UserCard> cards;
//    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
//    private List<UserCard> cards;

//    @OneToMany(fetch = FetchType.LAZY )
//    @JoinTable(name = "cashflow",
//            joinColumns = @JoinColumn(name = "user_id"))
//    private Collection<CashFlow> cashFlows;
//
//    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
//    private List<CashFlow> cashFlows;

}
