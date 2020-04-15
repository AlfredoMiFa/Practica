package com.mistborn.consumer;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ImplementationConsumer {
	
	private static final Logger log = LoggerFactory.getLogger(ImplementationConsumer.class);
	
	public void imprime() {
		FilterConsumer.forEach(Arrays.asList(1,2,3,4,5), (Integer i) -> log.info("{}",i));
	}
}
