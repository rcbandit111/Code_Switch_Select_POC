package org.service;

import org.poc.PayloadObject;
import org.poc.ResponseObject;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service("second")
public class SecondService implements MessageProcessor {

    @Override
    public ResponseObject processMessage(PayloadObject payloadObject) {
        return new ResponseObject("second payload");
    }
}
