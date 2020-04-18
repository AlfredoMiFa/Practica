package com.mistborn;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mistborn.consumer.ImplementationConsumer;
import com.mistborn.entity.Apple;
import com.mistborn.function.ImplementationFunction;
import com.mistborn.implement.capsTwoAndThree.AppleComparator;
import com.mistborn.lambda.inference.LambdaInference;
import com.mistborn.predicate.ImplementationPredicate;
import com.mistborn.unboxing.ImplementationIntPredicate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PracticaApplicationTests {
	
	private static final Logger log = LoggerFactory.getLogger(PracticaApplicationTests.class);
	
	@Autowired
	private ImplementationPredicate predicate;
	
	@Autowired
	private ImplementationConsumer consumer;
	
	@Autowired
	private ImplementationFunction function;
	
	@Autowired
	private ImplementationIntPredicate intPredicate;
	
	@Autowired
	private LambdaInference lambda;
	
	@Autowired
	private AppleComparator comparator;
	
	@Test
	public void contextLoads() {
		List<Apple> list = Arrays.asList(new Apple("red",4),new Apple("green",5),new Apple("yellow",23),new Apple("blue",23));
		comparator.anonynusClass(list);
		list.forEach(t->log.info(t.toString()));
		comparator.lambdaExpressions(list);
		list.forEach(t->log.info(t.toString()));
		comparator.methodReference(list);
		list.forEach(t->log.info(t.toString()));
	}

}
