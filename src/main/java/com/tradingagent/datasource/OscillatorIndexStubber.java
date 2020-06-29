package com.tradingagent.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class OscillatorIndexStubber implements IndexDataSource {
	@Value("${oscillator.hi}")
	private double hi;
	@Value("${oscillator.lo}")
	private double lo;
	@Autowired
	private Random random;

	@Override
	public double getIndexValue() {
		return lo + (hi - lo) * random.nextDouble();
	}
}
