package org.poc;

import org.service.MessageProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/test")
public class PocController {

    private static final Logger LOG = LoggerFactory.getLogger(PocController.class);

    private MessageProcessor defaultProcessor;
    private Map<String, MessageProcessor> processors;

    @Autowired
    public PocController(MessageProcessor defaultProcessor,
                         Map<String, MessageProcessor> processors) {
        this.defaultProcessor = defaultProcessor;
        this.processors = processors;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/endpoint", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseObject process(@RequestBody PayloadObject payloadObject)
    {
        MessageProcessor messageProcessor = processors.getOrDefault(payloadObject.getName(), defaultProcessor);
        return messageProcessor.processMessage(payloadObject);
    }
}
