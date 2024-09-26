package com.borntocode.main;

import com.borntocode.pojo.LazyRegistryWithDCL;

public class Client {
	public static void main(String[] args) {
		LazyRegistryWithDCL lazyRegistryWithDCL = LazyRegistryWithDCL.getINSTANCE();
		LazyRegistryWithDCL lazyRegistryWithDCL2 = LazyRegistryWithDCL.getINSTANCE();
		System.out.println(lazyRegistryWithDCL.hashCode());
		System.out.println(lazyRegistryWithDCL2.hashCode());
	}
}
