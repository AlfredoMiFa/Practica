package com.mistborn.implement.capsTwoAndThree;

import java.util.Comparator;
import static java.util.Comparator.comparing;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mistborn.entity.Apple;

@Component
public class AppleComparator implements Comparator<Apple> {
	
	private static final Logger log = LoggerFactory.getLogger(AppleComparator.class);

	@Override
	public int compare(Apple o1, Apple o2) {
		log.info("Implements Comparator interface");
		return o1.getWeight() > o2.getWeight() ? -1 : o1.getWeight() == o2.getWeight() ? 0 : 1;
	}
	
	public List<Apple> anonynusClass(List<Apple> list) {
		log.info("anonynusClass");
		list.sort(new Comparator<Apple> () {
			public int compare(Apple o1, Apple o2) {
				return o1.getWeight() > o2.getWeight() ? 1 : o1.getWeight() == o2.getWeight() ? 0 : -1;
			}
		});
		return list;
	}
	
	public List<Apple> lambdaExpressions(List<Apple> list) {
		log.info("lambdaExpressions");
		list.sort((o1,o2) -> o1.getWeight() > o2.getWeight() ? 1 : o1.getWeight() == o2.getWeight() ? 0 : -1);
		return list;
	}
	
	public List<Apple> methodReference(List<Apple> list) {
		log.info("methodReference");
		list.sort(comparing(Apple::getWeight).thenComparing(Apple::getColor));
		return list;
	}
}
