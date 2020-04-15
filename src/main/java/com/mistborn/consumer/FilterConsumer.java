package com.mistborn.consumer;

import java.util.List;
import java.util.function.Consumer;

public class FilterConsumer {
	
	/**
	 * Defines an abstract method named accept that accepts an object of generic type T and returns no results(void)
	 * @param <T>
	 * @param list
	 * @param c
	 */
	public static <T> void forEach(List<T> list, Consumer<T> c) {
		for(T i: list) {
			c.accept(i);
		}
	}
	
}
