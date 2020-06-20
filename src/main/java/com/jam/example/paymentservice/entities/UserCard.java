package com.jam.example.paymentservice.entities;

import com.jam.example.paymentservice.entities.base.AbstractEntityNoGen;
import grpc.UUID;
import lombok.*;

import javax.persistence.*;


@Entity
@Table(name="user_card")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class UserCard extends AbstractEntityNoGen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID card_id;

    private String card_number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    public UserCard(String card_number,User user) {
        this.card_number = card_number;
        this.user=user;
    }

}
















    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRole userRole = (UserRole) o;
        return name.equals(userRole.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public enum Values {
        ADMIN("ROLE_ADMIN"),
        USER("ROLE_USER"),
        ANONYMOUS("ROLE_ANONYMOUS"),
        RESOURCE("ROLE_RESOURCE"),
        REFRESH("ROLE_REFRESH");

        private final static Map<String, Values> ENUM_MAP = new HashMap<>();

        static {
            for(Values item : Values.values()) {
                if (ENUM_MAP.containsKey(item.name)){
                    throw new RuntimeException("UserRole.Values duplicate code");
                }
                ENUM_MAP.put(item.name, item);
            }
        }

        @NotNull
        public static Values nameOf(String name) throws IllegalArgumentException {

            Values result = ENUM_MAP.get(name);
            if (result == null) {
                throw new IllegalArgumentException("Values - no matching constant for [" + name + "]");
            }
            return result;
        }

        @Getter
        private String name;

        Values(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
    */


