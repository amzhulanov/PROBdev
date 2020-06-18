package com.jam.example.paymentservice.entities;

import com.jam.example.paymentservice.entities.base.AbstractEntityNoGen;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "uzer")
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
public class User extends AbstractEntityNoGen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long user_id;

    @NotNull
    private String password;

    @NotNull
    private String firstName;

    @NotNull
    private BigDecimal balance;

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
