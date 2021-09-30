/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *	  https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.frontbackend.springboot.api;

import com.frontbackend.springboot.api.Controller;
import com.frontbackend.springboot.models.SumaObject;
import com.frontbackend.springboot.services.TestService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

@RunWith( MockitoJUnitRunner.class )
public class ControllerTests {


	@Mock
	TestService testService;

	@InjectMocks
	Controller controller;



	@Test
	public void noParamGreetingShouldReturnDefaultMessage(){

		SumaObject sumaObject = new SumaObject( 30, 50);
		Mockito.when( testService.suma(30,50) ).thenReturn(80);

		ResponseEntity result = controller.suma( sumaObject );

		Assert.assertEquals( 200, result.getStatusCodeValue());

	}

	@Test
	public void badRequestError(){

		SumaObject sumaObject = new SumaObject( 5, 50);
		Mockito.when( testService.suma(5,50) ).thenReturn(55);

		ResponseEntity result = controller.suma( sumaObject );

		Assert.assertEquals( 400, result.getStatusCodeValue());

	}

	@Test
	public void helloWorldTest(){


		String result = controller.test( );

		Assert.assertEquals( "Hello World!", result);

	}


}