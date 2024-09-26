package com.borntocode.pojo;

public class EagerRegistry {
	private EagerRegistry() {

	}

	private static final EagerRegistry ia = new EagerRegistry();

	public static EagerRegistry getInstance() {
		return ia;
	}

}
