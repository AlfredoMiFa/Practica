package com.mistborn.manage.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.function.Function;

/**
 * Example Exception wrap in lambda
 * @author mistborn
 *
 */
public class ManageExceptionWrap {
	
	public void example() {
		Function<BufferedReader, String> f = (BufferedReader b) -> {
			try {
				return b.readLine();
			}catch(IOException ex) {
				throw new RuntimeException(ex);
			}
		};
	}
	
}
