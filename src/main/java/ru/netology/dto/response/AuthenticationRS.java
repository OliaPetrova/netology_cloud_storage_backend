package ru.netology.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthenticationRS {

	@JsonProperty("auth-token")
	private String authToken;

	public AuthenticationRS(String authToken) {
		this.authToken = authToken;
	}

}