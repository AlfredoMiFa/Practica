package com.mistborn.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterPredicate {
	
	/**
	 * Defines an abstract method named test that accepts an object of generic type T and returns a boolean
	 * @param <T>
	 * @param list
	 * @param p
	 * @return
	 */
	public static <T> List<T> filter(List<T> list, Predicate<T> p) {
		List<T> results = new ArrayList<>();
		for(T s : list) {
			if(p.test(s)) {
				results.add(s);
			}
		}
		return results;
	}
	
}