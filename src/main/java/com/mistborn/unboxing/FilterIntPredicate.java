package com.mistborn.unboxing;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class FilterIntPredicate {
	
	public static <T> boolean numbers(int number, IntPredicate p) {
		return p.test(number);
	}
	
	public static <T> boolean numbers(T number, Predicate<T> p) {
		return p.test(number);
	}
	
}
