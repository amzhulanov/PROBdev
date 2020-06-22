package com.jam.example.paymentservice.api.mapper;

import com.google.protobuf.ByteString;
import com.jam.example.paymentservice.entities.JournalOperation;
import grpc.BDecimal;
import grpc.BInteger;
import grpc.Operation;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

@Component
public class ConvertEntityToGrpc {

    public BDecimal BigDecimalTogrpcBDecimal(BigDecimal bigDecimal) {
        BigInteger bigI = bigDecimal.toBigInteger();
        BInteger.Builder builder = BInteger.newBuilder();
        ByteString bytes = ByteString.copyFrom(bigI.toByteArray());
        builder.setValue(bytes);
        BInteger bInteger=builder.build();
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

    public Operation journalOperationToOperation(JournalOperation journalOperation) {

        return Operation.newBuilder()
                .setUserId(javaUUIDToGrpcUUID(journalOperation.getUser().getUser_id()))
                .setTypeOperation(journalOperation.getTypeOperation().toString())
                .setNumber(journalOperation.getUserCard().getCard_number())
                .setAmount(BigDecimalTogrpcBDecimal(journalOperation.getAmount()))
                .build();
    }

//    public ListOfOperation journalOperationsToListOperations(List<JournalOperation> journalOperationList) {
//        List<Operation> operationList = null;
//        journalOperationList.stream().forEach((p) -> operationList.add(journalOperationToOperation(p)));
//        ListOfOperation.Builder builder = ListOfOperation.newBuilder();
//
//        journalOperationList.stream().forEach((p) -> builder.addOperation(journalOperationToOperation(p)));
//
//        builder.build();
//
//    }
}

