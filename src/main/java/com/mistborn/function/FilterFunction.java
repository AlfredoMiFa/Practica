package com.mistborn.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FilterFunction {
	
	/**
	 * Defines an abstract method named apply that takes an object of generic type T as input and returns an object of generic type R
	 * @param <T>
	 * @param <R>
	 * @param list
	 * @param f
	 * @return
	 */
	public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
		List<R> result = new ArrayList<>();
		for(T t: list) {
			result.add(f.apply(t));
		}
		return result;
	}
	
}
