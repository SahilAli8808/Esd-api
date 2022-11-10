package com.code.develop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.develop.model.Signintable;
import com.code.develop.repo.Signintablerepo;

@Service
public class SignInService {
	@Autowired
	 private Signintablerepo repo;
	public Signintable SaveSignInTable(Signintable obj) {
		return repo.save(obj);
	}
	
}
