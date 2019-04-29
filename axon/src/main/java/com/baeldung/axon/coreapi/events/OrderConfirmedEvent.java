package com.baeldung.axon.coreapi.events;

import lombok.Value;

@Value
public class OrderConfirmedEvent {

    private final String orderId;
}
