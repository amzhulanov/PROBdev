package com.jam.example.paymentservice.entities.base;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.Instant;

/**
 * Base for simple entities and
 * entities with InheritanceType.TABLE_PER_CLASS
 */
@MappedSuperclass
@Getter
public abstract class AbstractEntityNoGen implements Serializable {

    @Column(name = "created", updatable = false)
    @CreationTimestamp
    protected Instant created;


    @Column(name = "updated")
    @UpdateTimestamp
    protected Instant updated;

    @Setter
    @Getter
    protected boolean enabled = true;

    protected AbstractEntityNoGen() {}


}
