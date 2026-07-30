package com.example.producer;

import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaProducerStreams {
	@Bean
	public Supplier<RiderLocation> sendRiderLocation(){
		return() ->{
			RiderLocation location = new RiderLocation("rider123", 15.5,17.5);
			System.out.println("Sending: " + location.getRiderId());
			return location;
		};
	}
}
  