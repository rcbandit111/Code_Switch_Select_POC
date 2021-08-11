package org.service;

import org.poc.PayloadObject;
import org.poc.ResponseObject;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("first")
public class FirstService implements MessageProcessor {

    @Override
    public ResponseObject processMessage(PayloadObject payloadObject) {
        return new ResponseObject("first payload");
    }
}
