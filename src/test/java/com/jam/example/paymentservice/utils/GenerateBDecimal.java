package com.jam.example.paymentservice.utils;

import com.google.protobuf.ByteString;
import grpc.BDecimal;
import grpc.BInteger;
import org.springframework.stereotype.Component;

@Component
public class GenerateBDecimal{

    public BDecimal getbDecimal() {
        BInteger bInteger = BInteger.newBuilder()
                .setValue(ByteString.copyFrom(new byte[2]))
                .build();
        return BDecimal.newBuilder()
                .setScale(1)
                .setIntVal(bInteger)
                .build();
    }
}
