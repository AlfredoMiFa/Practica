package com.mistborn.unboxing;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ImplementationIntPredicate {
	
	private static final Logger log = LoggerFactory.getLogger(ImplementationIntPredicate.class);
	
	/**
	 * No boxing
	 */
	public void numberPar() {
		IntPredicate evenNumbers = (int i) -> i%2==0;
		log.info("The number {} is pair: {}", 512, FilterIntPredicate.numbers(512,evenNumbers));
	}
	
	/**
	 * Boxing
	 */
	public void numberPar1() {
		Predicate<Integer> evenNumbers = (Integer i) -> i%2==0;
		log.info("The number {} is pair: {}", 511, FilterIntPredicate.numbers(511,evenNumbers));
	}
	
}
