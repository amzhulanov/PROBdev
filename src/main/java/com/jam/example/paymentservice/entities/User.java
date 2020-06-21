package com.jam.example.paymentservice.entities;

import com.jam.example.paymentservice.entities.base.AbstractEntityNoGen;
import grpc.BDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "uzer")
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class User extends AbstractEntityNoGen {

    @Id
    @GeneratedValue
    @Column( columnDefinition = "uuid", updatable = false )
////    @GenericGenerator(name="system-uuid", strategy = "uuid")
//    @org.hibernate.annotations.Type(type="pg-uuid")
    protected UUID user_id;

    @NotNull
    private String password;

    @NotNull
    private String firstName;

    @NotNull
    private BigDecimal balance;

    public User(String firstName, String password,BigDecimal balance) {
        this.firstName = firstName;
        this.password = password;
        this.balance=balance;
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
