package org.service;

import org.poc.PayloadObject;
import org.poc.ResponseObject;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("defaultProcessor")
public class DefaultService implements MessageProcessor {

    @Override
    public ResponseObject processMessage(PayloadObject payloadObject) {
        return new ResponseObject("default payload");
    }
}
