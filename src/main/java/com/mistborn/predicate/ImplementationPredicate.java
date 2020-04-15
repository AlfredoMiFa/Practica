package com.mistborn.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ImplementationPredicate {
	
	private static final Logger log = LoggerFactory.getLogger(ImplementationPredicate.class);
	
	public void predicate() {
		Predicate<String> nonEmptyStringPredicate = (String s)-> !s.isEmpty();
		List<String> list = Arrays.asList("Hola","No","","Si");
		List<String> nonEmpty = FilterPredicate.filter(list, nonEmptyStringPredicate);
		nonEmpty.forEach(t->log.info(t));
	}
	
}