package com.mistborn.function;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ImplementationFunction {
	
	private static final Logger log = LoggerFactory.getLogger(ImplementationFunction.class);
	
	public void imprime() {
		List<Integer> list = FilterFunction.map(Arrays.asList("lambdas","in","action"), (String s) -> s.length());
		list.forEach(t->log.info("{}",t));
	}
	
}
