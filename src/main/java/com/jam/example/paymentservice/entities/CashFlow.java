package com.jam.example.paymentservice.entities;

import com.jam.example.paymentservice.entities.base.AbstractEntityNoGen;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "cashflow")
@Data
@EqualsAndHashCode(callSuper=false)
public class CashFlow extends AbstractEntityNoGen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long cashflow_id;

    @NotNull
    private BigDecimal amount;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")
    private User user;

    public CashFlow() {
    }

    public CashFlow(Long cashflow_id,User user, BigDecimal amount) {
        this.cashflow_id=cashflow_id;
        this.user = user;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "User{" +
                "cashflow_id=" + cashflow_id +
                ", userId=" + user.user_id +
                ", amount=" + amount +
                '}';
    }

}
