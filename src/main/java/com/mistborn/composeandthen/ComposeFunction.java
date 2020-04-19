package com.mistborn.composeandthen;

import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ComposeFunction {
	
	private static final Logger log = LoggerFactory.getLogger(ComposeFunction.class);
	
	public void andThen() {
		Function<Integer,Integer> f = x -> x+1;
		Function<Integer,Integer> g = x -> x*2;
		Function<Integer,Integer> h = f.andThen(g);
		int result = h.apply(1);
		log.info("Resultado: {}",result);
	}
	
	public void composeFunction() {
		Function<Integer,Integer> f = x -> x+1;
		Function<Integer,Integer> g = x -> x*2;
		Function<Integer,Integer> h = f.compose(g);
		int result = h.apply(1);
		log.info("Resultado: {}",result);
	}
	
}
