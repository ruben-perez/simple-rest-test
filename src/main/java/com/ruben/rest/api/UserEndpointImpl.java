package com.ruben.rest.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruben.rest.api.response.UserResponse;

@RestController
@RequestMapping(value = "/rest", produces = "application/json; charset=utf8")
public class UserEndpointImpl implements UserEndpoint {

	@Override
	public UserResponse getUsers() {
		return new UserResponse(1, "name", "email");
	}

}
