package com.jam.example.paymentservice.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;


@AllArgsConstructor
@Getter
public enum TypeOperation {

    //NULL(0), // kludge
    PAYMENT(1),
    ENROLL(2),
    REFUND(3),
    ADDCARD(4);

    private final static Map<Integer, TypeOperation> ENUM_MAP = new HashMap<>();

    static {
        for (TypeOperation item : TypeOperation.values()) {
            if (ENUM_MAP.containsKey(item.id)) {
                throw new RuntimeException("TypeOperation duplicate id");
            }
            ENUM_MAP.put(item.id, item);
        }
    }

    private final int id;

    public static TypeOperation getById(int id) {

        TypeOperation result = ENUM_MAP.get(id);
        if (result == null) {
            throw new IllegalArgumentException("TypeOperation - no matching constant for [" + id + "]");
        }
        return result;
    }

}
