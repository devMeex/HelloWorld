package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	//Esto deberia testear el componente DemoApplication
	//cada test deberia testear los nuevos componentes que se
	// creando
	@Test
	public void contextLoads() {
		Assert.assertTrue("Assertion has been false",1==1);
	}

}
