package com.uap.Team2OneFlight.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uap.Team2OneFlight.backend.webclient.BackendAmadeusClient;

@Service
public class BackendAmadeusService {
	@Autowired
	BackendAmadeusClient apiClient;
	
	
}
