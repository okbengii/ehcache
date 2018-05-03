package com.demo;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:/conf/spring/spring-*.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTest extends AbstractJUnit4SpringContextTests{

}
