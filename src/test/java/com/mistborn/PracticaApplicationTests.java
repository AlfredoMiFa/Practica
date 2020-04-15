package com.mistborn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mistborn.consumer.ImplementationConsumer;
import com.mistborn.function.ImplementationFunction;
import com.mistborn.predicate.ImplementationPredicate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PracticaApplicationTests {
	
	@Autowired
	private ImplementationPredicate predicate;
	
	@Autowired
	private ImplementationConsumer consumer;
	
	@Autowired
	private ImplementationFunction function;

	@Test
	public void contextLoads() {
		predicate.predicate();
		consumer.imprime();
		function.imprime();
	}

}
