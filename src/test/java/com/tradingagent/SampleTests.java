package com.tradingagent;

import com.tradingagent.manager.TraningManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class SampleTests
{
	@Autowired
	private TraningManager manager;

	@Test
	public void testMain()
	{
		long start = System.currentTimeMillis();
		manager.performTraining();
		System.out.println((System.currentTimeMillis() - start));
	}
}
