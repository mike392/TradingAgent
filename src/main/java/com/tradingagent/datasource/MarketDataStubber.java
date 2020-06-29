package com.tradingagent.datasource;

import com.tradingagent.entity.AskBid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MarketDataStubber implements MarketDataSource {
	@Autowired
	private Random random;
	@Value("${granularity.index}")
	private int granularity;
	private int spread = 2;

	@Override
	public AskBid getAskBid() {
		double nextVal = granularity*random.nextDouble();
		return new AskBid(nextVal+spread,nextVal);
	}
}
