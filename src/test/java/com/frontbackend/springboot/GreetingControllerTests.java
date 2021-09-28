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
package com.frontbackend.springboot;

import com.frontbackend.springboot.models.Greeting;
import com.frontbackend.springboot.api.GreetingController;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
public class GreetingControllerTests {

	GreetingController greetingController =  new GreetingController();


	@Test
	public void noParamGreetingShouldReturnDefaultMessage(){

		Greeting result = greetingController.greeting( "JP" );

		Assert.assertEquals( "Hello, JP!", result.getContent() );
	}


}