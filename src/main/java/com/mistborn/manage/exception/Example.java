package com.mistborn.manage.exception;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Example FunctionalInterface
 * @author mistborn
 *
 */
@FunctionalInterface
public interface Example {
	
	String process(BufferedReader b) throws IOException;
	
}
