package com.example.demo.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Kafka.kafkaProducers;
@RestController
@RequestMapping("Writing/message")
public class KafkaController {
   //@Autowired
//    private KafkaProducers kafkaProducers;

    @Autowired
    private kafkaProducers kafkaProducers;


    public KafkaController(kafkaProducers kafkaProducers) {
        this.kafkaProducers = kafkaProducers;
    }


    @GetMapping("/writing")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
        kafkaProducers.sendMessage(message);
        return ResponseEntity.ok("message sent to the topic");
    }





}
