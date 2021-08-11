package org.service;

import org.poc.PayloadObject;
import org.poc.ResponseObject;
import org.springframework.stereotype.Component;

@Component("defaultProcessor")
public class DefaultService implements MessageProcessor {

    @Override
    public ResponseObject processMessage(PayloadObject payloadObject) {
        return new ResponseObject("default payload");
    }
}
