package com.example.demo.Controller;
import com.example.demo.Kafka.JsonProducer;
import com.example.demo.Payload.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("jsonTesting")
public class JsonController {
    private JsonProducer jsonProducer;

    public JsonController(JsonProducer jsonProducer) {
        this.jsonProducer = jsonProducer;
    }

    @PostMapping("/postMessage")
    public ResponseEntity<String> publish(@RequestBody User user)
            throws JsonProcessingException {
        jsonProducer.sendMessage(user);
        return ResponseEntity.ok("Json Message sent to kafka topic.");
    }
}