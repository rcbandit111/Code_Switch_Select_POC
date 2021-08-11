package org.service;

import org.poc.PayloadObject;
import org.poc.ResponseObject;

public interface MessageProcessor {

    ResponseObject processMessage(PayloadObject payloadObject);
}
