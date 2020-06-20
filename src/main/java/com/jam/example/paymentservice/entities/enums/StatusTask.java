package com.jam.example.paymentservice.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;


@AllArgsConstructor
@Getter
public enum StatusTask {

    NULL(0), // kludge
    SUCCESS(1),
    EXECUTED(2),
    NEW(3);

    private final static Map<Integer, StatusTask> ENUM_MAP = new HashMap<>();

    static {
        for (StatusTask item : StatusTask.values()) {
            if (ENUM_MAP.containsKey(item.id)) {
                throw new RuntimeException("TypeOperation duplicate id");
            }
            ENUM_MAP.put(item.id, item);
        }
    }

    private final int id;

    public static StatusTask getById(int id) {

        StatusTask result = ENUM_MAP.get(id);
        if (result == null) {
            throw new IllegalArgumentException("Status - no matching constant for [" + id + "]");
        }
        return result;
    }

}
