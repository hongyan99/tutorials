package com.baeldung.axon.coreapi.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import lombok.Value;

@Value
public class ConfirmOrderCommand {

    @TargetAggregateIdentifier
    private String orderId;
}
