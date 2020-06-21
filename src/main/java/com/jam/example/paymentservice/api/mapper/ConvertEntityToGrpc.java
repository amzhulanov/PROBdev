package com.jam.example.paymentservice.api.mapper;

import com.google.protobuf.ByteString;
import grpc.BDecimal;
import grpc.BInteger;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.UUID;

@Component
public class ConvertEntityToGrpc {

    public BDecimal BigDecimalTogrpcBDecimal(BigDecimal bigDecimal) {
        BigInteger bigI = bigDecimal.toBigInteger();
        bigI.byteValue();
        BInteger bInteger = BInteger.newBuilder()
                .setValue(ByteString.copyFrom(ByteBuffer.allocateDirect(bigI.byteValue())))
                .build();
        return BDecimal.newBuilder()
                .setScale(1)
                .setIntVal(bInteger)
                .build();
    }

    public grpc.UUID javaUUIDToGrpcUUID(UUID javaUUID) {
        return grpc.UUID.newBuilder()
                .setValue(javaUUID.toString())
                .build();
    }
}
