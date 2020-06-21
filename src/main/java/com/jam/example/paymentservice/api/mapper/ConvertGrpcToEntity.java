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
public class ConvertGrpcToEntity {

    public BigDecimal grpcBDecimalToBigDecimal(BDecimal bd) {
        ByteString bytes = bd.getIntVal().getValue();
        BigDecimal bigI = new BigDecimal(new BigInteger(bytes.toByteArray()));
        return bigI;
    }

    public UUID grpcUUIDToJavaUUID(grpc.UUID grpcUUID) {
        return UUID.fromString(grpcUUID.getValue());
    }

}
