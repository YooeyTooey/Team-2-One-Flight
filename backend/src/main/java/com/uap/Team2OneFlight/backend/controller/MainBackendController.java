package com.uap.Team2OneFlight.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.uap.Team2OneFlight.backend.models.AccCredentials;
import com.uap.Team2OneFlight.backend.service.BackendAmadeusService;

public class MainBackendController {
	@Autowired
	BackendAmadeusService encryptDecryptService;
	
	@GetMapping("/login")
	String login(@RequestBody AccCredentials account) {
		 return account.getUsername();
	}
}
