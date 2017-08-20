package com.alexarkhipov.poetryexpertquiz.utils;

public interface NeoCrypt {
	public String generatePasswordHash(String password);

	public boolean validatePasswordHash(String password, String hash);
}
