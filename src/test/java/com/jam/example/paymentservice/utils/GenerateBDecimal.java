package com.jam.example.paymentservice.utils;

import com.google.protobuf.ByteString;
import grpc.BDecimal;
import grpc.BInteger;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.BigInteger;

/*
используется исключительно для генерации тестовых запросов
 */
@Component
public class GenerateBDecimal {

    public BDecimal getbDecimal(BigInteger val) {
        BInteger.Builder builder = BInteger.newBuilder();
        ByteString bytes = ByteString.copyFrom(val.toByteArray());
        builder.setValue(bytes);
        BInteger bInteger = builder.build();
        return BDecimal.newBuilder()
                .setScale(1)
                .setIntVal(bInteger)
                .build();
    }

    public BInteger writeBInteger(BigInteger val) {

        BInteger.Builder builder = BInteger.newBuilder();
        ByteString bytes = ByteString.copyFrom(val.toByteArray());
        builder.setValue(bytes);
        return builder.build();
    }

    public byte[] bigDecimalToByte(BigDecimal num) {
        BigInteger sig = new BigInteger(num.unscaledValue().toString());
        int scale = num.scale();
        byte[] bscale = new byte[]{
                (byte) (scale >>> 24),
                (byte) (scale >>> 16),
                (byte) (scale >>> 8),
                (byte) (scale)
        };
        return (byte[]) ArrayUtils.addAll(bscale, sig.toByteArray());
    }

    public BigDecimal byteToBigDecimal(byte[] raw) {
        int scale = (raw[0] & 0xFF) << 24 |
                (raw[1] & 0xFF) << 16 |
                (raw[2] & 0xFF) << 8 |
                (raw[3] & 0xFF);
        BigInteger sig = new BigInteger(ArrayUtils.subarray(raw, 1, 4));
        return new BigDecimal(sig, scale);
    }

}
