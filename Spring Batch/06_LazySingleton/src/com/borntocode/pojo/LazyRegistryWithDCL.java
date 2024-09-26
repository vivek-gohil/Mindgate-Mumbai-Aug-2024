package com.borntocode.pojo;

// This class demonstrates singleton pattern using double check locking or "classic" singleton.
// This is also a lazy initialing singleton
// Although this implementation solves the multi-threading issue with lazy initialization using volatile and double check locking 
// The volatile keyword is guaranteed to work only after JVMs starting with version 1.5 and later 
public class LazyRegistryWithDCL {
	private LazyRegistryWithDCL() {

	}

	private static volatile LazyRegistryWithDCL INSTANCE;

	public static LazyRegistryWithDCL getINSTANCE() {
		if (INSTANCE == null) {
			synchronized (LazyRegistryWithDCL.class) {
				if (INSTANCE == null) {
					INSTANCE = new LazyRegistryWithDCL();
				}
			}
		}
		return INSTANCE;
	}

}
