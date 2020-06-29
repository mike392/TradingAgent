package com.tradingagent.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class AlligatorIndexStubber implements IndexDataSource {
	@Value("${alligator.hi}")
	private double hi;
	@Value("${alligator.lo}")
	private double lo;
	@Autowired
	private Random random;

	@Override
	public double getIndexValue() {
		return lo + (hi - lo) * random.nextDouble();
	}
}
