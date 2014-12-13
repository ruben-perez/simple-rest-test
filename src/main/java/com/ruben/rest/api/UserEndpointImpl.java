package com.ruben.rest.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ruben.rest.api.response.UserResponse;

@RestController
@RequestMapping(value = "/rest", produces = "application/json; charset=utf8")
public class UserEndpointImpl implements UserEndpoint {

	@Override
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
	public UserResponse getUsers() {
		return new UserResponse(1, "name", "email");
	}

}
