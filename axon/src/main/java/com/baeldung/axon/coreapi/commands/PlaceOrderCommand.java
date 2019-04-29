package com.baeldung.axon.coreapi.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import lombok.Value;

@Value
public class PlaceOrderCommand {

    @TargetAggregateIdentifier
    private final String orderId;
    private final String product;
}