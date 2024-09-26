package com.borntocode.main;

import com.borntocode.pojo.EagerRegistry;

public class Client {
public static void main(String[] args) {
	//EagerRegistry registry = new EagerRegistry();
	
	EagerRegistry registry = EagerRegistry.getInstance();
	System.out.println(registry.hashCode());
	EagerRegistry registry2 = EagerRegistry.getInstance();
	System.out.println(registry2.hashCode());
}
}
