package com.uap.Team2OneFlight.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import com.uap.Team2OneFlight.backend.webclient.BackendAmadeusClient;

@Configuration
public class BackendAmadeusConfig {
	@Bean
	BackendAmadeusClient encryptionApi() {
		WebClient webClient = WebClient.builder()
				.baseUrl("https://test.api.amadeus.com/v1/")
				.defaultHeader("Authorization", "Bearer 2ig5P24mry8Jmx77wehAhzHu4VoiRcvr")
				.build();
		
		HttpServiceProxyFactory httpServiceProxyFactory = HttpServiceProxyFactory
				.builder(WebClientAdapter.forClient(webClient))
				.build();
		return httpServiceProxyFactory.createClient(BackendAmadeusClient.class);
	}
}
