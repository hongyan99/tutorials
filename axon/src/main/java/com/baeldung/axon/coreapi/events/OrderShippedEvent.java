package com.baeldung.axon.coreapi.events;

import lombok.Value;

@Value
public class OrderShippedEvent {

    private final String orderId;
}