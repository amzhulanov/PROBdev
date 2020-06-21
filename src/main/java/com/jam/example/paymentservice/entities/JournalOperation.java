package com.jam.example.paymentservice.entities;

import com.jam.example.paymentservice.entities.base.AbstractEntityNoGen;
import com.jam.example.paymentservice.entities.enums.TypeOperation;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "journal")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class JournalOperation extends AbstractEntityNoGen {

    @Id
    @GeneratedValue
    @Column( columnDefinition = "uuid", updatable = false )
    protected UUID journal_id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="card_id")
    private UserCard userCard;

    @NotNull
    private BigDecimal amount;

    //@Transient - нельзя иначе хибер скажет что изменения только в этом поле
    // не меняют сущность и не будет вызывать @PreUpdate
    // - мусорное поле в базе
    private TypeOperation typeOperation;

    // enum mapping TypeOperation
    // Enum mapping
    @Basic
    private int typeOperationValue;

    @PostLoad
    void fillOperationCode() {
        this.typeOperation = TypeOperation.getById(typeOperationValue);
    }

    @PrePersist
    @PreUpdate
    void fillOperationCodeValue() {
        if (typeOperation != null) {
            this.typeOperationValue = typeOperation.getId();
        }
    }

    public JournalOperation(User user,TypeOperation typeOperation,UserCard userCard, BigDecimal amount){
        this.user=user;
        this.typeOperation=typeOperation;
        this.userCard=userCard;
        this.amount=amount;
    }

    @Override
    public String toString() {
        return "User{" +
                ", userId=" + user.user_id +
                ", typeOperation=" + typeOperation +
                ", userCard=" + userCard.getCard_number() +
                ", amount=" + amount.toString() +
                '}';
    }

}
