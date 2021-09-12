package com.tct.bestMovieApp.security;

import org.jasypt.util.password.StrongPasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncryptionServiceImpl implements EncryptionService {

	private StrongPasswordEncryptor strongPasswordEncryptor ;
	
	@Autowired
	private void setStrongPassEncryptor(StrongPasswordEncryptor strongPasswordEncryptor) {
		this.strongPasswordEncryptor = strongPasswordEncryptor;
	}
	
	@Override
	public String encryptString(String input) {
		return strongPasswordEncryptor.encryptPassword(input);
	}

	@Override
	public boolean checkPassword(String plainPassword, String encryptedPassword) {
		return strongPasswordEncryptor.checkPassword(plainPassword, encryptedPassword);
	}

}
