package com.example.demonative;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
class MyService {

	private final MyRepository myRepository;

	public MyService(MyRepository myRepository) {
		this.myRepository = myRepository;
	}

	public MyRepository getMyRepository() {
		return myRepository;
	}
}
