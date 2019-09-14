package com.example.fooapp;

import io.zonky.test.db.AutoConfigureEmbeddedDatabase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//https://stackoverflow.com/a/49011982/1098564
@AutoConfigureEmbeddedDatabase
public class FooAppApplicationTests {

	@Test
	public void contextLoads() {
	}

}
