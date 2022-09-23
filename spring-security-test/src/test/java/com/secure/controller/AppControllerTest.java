package com.secure.controller;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.util.Base64Utils;

import com.secure.entity.Employee;

@RunWith(SpringRunner.class)
@WebMvcTest(AppController.class)
@ActiveProfiles(value = "true")
public class AppControllerTest {
	

	@Autowired
	private MockMvc mockMvc;
	
	@Value("${employee.get.url}")
	private String geturl;
	
	@Value("${employee.post.url}")
	private String posturl;
	
	@Value("${employee.put.url}")
	private String puturl;
	
	@Value("${employee.delete.url}")
	private String deleteurl;
	
	@Value("${user.user1.username}")
	private String username1;
	
	@Value("${user.user1.password}")
	private String password1;
	
	@Value("${user.admin.username}")
	private String admin_username1;
	
	@Value("${user.admin.password}")
	private String admin_password1;
	
	@Test
	public void testEmployeeGet() throws Exception{
		ResultActions resultActions = processApiRequest(geturl, HttpMethod.GET, null, null, username1, password1);
		resultActions.andExpect(status().isOk());
		String result = resultActions.andReturn().getResponse().getContentAsString();
		assertEquals("Get Employees",result);
	}
	
	private ResultActions processApiRequest(String api, HttpMethod methodType, String name, Employee emp,
			String username, String password) {
		
		ResultActions response = null;
		String secret = "Basic"+ Base64Utils.encodeToString((username+":"+password).getBytes());
		try {
			switch (methodType) {
			case GET: {
				response = mockMvc.perform(get(api).header(HttpHeaders.AUTHORIZATION, secret));
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + methodType);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return response;
		
		
	}

}
