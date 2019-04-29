package com.baeldung.axon.coreapi.events;

import lombok.Value;

@Value
public class OrderPlacedEvent {

    private final String orderId;
    private final String product;
}