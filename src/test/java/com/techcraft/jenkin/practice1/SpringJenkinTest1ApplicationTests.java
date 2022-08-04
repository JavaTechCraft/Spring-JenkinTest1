package com.techcraft.jenkin.practice1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class SpringJenkinTest1ApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinTest1ApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Inside test class start executing");
		assertEquals(true, true);
	}

}
