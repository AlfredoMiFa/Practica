package com.mistborn.lambda.inference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mistborn.entity.Apple;
import com.mistborn.predicate.FilterPredicate;

@Component
public class LambdaInference {
	
	private static final Logger log = LoggerFactory.getLogger(LambdaInference.class);
	
	public void notInference() {
		List<Apple> inventory = Arrays.asList(new Apple("green",6),new Apple("red",5));
		/**
		 * No explicit type on the paramenter p
		 */
		List<Apple> greenApples = FilterPredicate.filter(inventory, p -> "green".equals(p.getColor()));
		greenApples.forEach(t->log.info(t.getColor()));
		/**
		 * Without type inference
		 */
		Comparator<Apple> c  = (Apple a1, Apple a2) -> a1.getColor().compareTo(a2.getColor());
		int n = c.compare(new Apple("green",6),new Apple("red",5));
		log.info("{}",n);
		/**
		 * With type inference
		 */
		Comparator<Apple> c1  = (a1, a2) -> a1.getColor().compareTo(a2.getColor());
		int n1 = c1.compare(new Apple("green",6),new Apple("red",5));
		log.info("{}",n1);
	}
	
}
