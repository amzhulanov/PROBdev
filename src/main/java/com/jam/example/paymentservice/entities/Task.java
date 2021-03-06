package com.jam.example.paymentservice.entities;

import com.jam.example.paymentservice.entities.base.AbstractEntityNoGen;
import com.jam.example.paymentservice.entities.enums.StatusTask;
import com.jam.example.paymentservice.entities.enums.TypeOperation;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "tasks")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Task extends AbstractEntityNoGen {

    @Id
    @GeneratedValue
    @Column( columnDefinition = "uuid", updatable = false )
    protected UUID task_id;

    @NotNull
    private BigDecimal amount;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "card_id")
    private UserCard userCard;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    //@Transient - нельзя иначе хибер скажет что изменения только в этом поле
    // не меняют сущность и не будет вызывать @PreUpdate
    // - мусорное поле в базе
    private StatusTask statusTask;
    @Basic
    @NotNull
    private int statusTaskValue;

    @PostLoad
    void fillStatusCode() {
        this.statusTask = StatusTask.getById(statusTaskValue);
        this.typeOperation = TypeOperation.getById(typeOperationValue);
    }

    @PrePersist
    @PreUpdate
    void fillStatusCodeValue() {
        if (statusTask != null) {
            this.statusTaskValue = statusTask.getId();
        }
        if (typeOperation != null) {
            this.typeOperationValue = typeOperation.getId();
        }
    }

    private TypeOperation typeOperation;
    @Basic
    @NotNull
    private int typeOperationValue;

    public Task(UserCard userCard,User user, TypeOperation typeOperation, BigDecimal amount, StatusTask statusTask) {
        this.userCard = userCard;
        this.user=user;
        this.typeOperation=typeOperation;
        this.amount = amount;
        this.statusTask = statusTask;
    }

    @Override
    public String toString() {
        return "Task{" +
                ", type=" + typeOperation +
                ", number Card=" + userCard.getCard_number() +
                ", user=" + userCard.getUser().getFirstName() +
                ", amount=" + amount +
                ", status=" + statusTask +
                '}';
    }

}
