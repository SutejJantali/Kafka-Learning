package com.example.producer;
//
//import org.apache.kafka.common.internals.Topic;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api")
//public class KafkaProducer {
//	private final KafkaTemplate<String, RiderLocation> kafkaTemplate;
//	
//	public KafkaProducer(KafkaTemplate<String, RiderLocation> kafkaTemplate) {
//		this.kafkaTemplate = kafkaTemplate;
//	}
//	
//	@PostMapping("/send")
//	public String sendMessage(@RequestParam String message) {
//		RiderLocation location = new RiderLocation("rider123", 28.61, 77.23);
//		kafkaTemplate.send("my-topic-new", location);
//		
//		return "Location sent: "+ message;
//	}
//}
