package com.spring.userresource.util;

import java.util.concurrent.atomic.AtomicInteger;

public class GenerateUniqueSequence {
	public static final AtomicInteger id = new AtomicInteger();

	public static int generateUniqueId() {

		return id.incrementAndGet();
	}
}
