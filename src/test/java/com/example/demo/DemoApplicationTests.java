package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.testng.Assert.assertEquals;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.example.demo");
        Config config = ctx.getBean(Config.class);
        assertEquals("value1", config.getProp1());
        assertEquals("value2", config.getProp2());
    }

}
