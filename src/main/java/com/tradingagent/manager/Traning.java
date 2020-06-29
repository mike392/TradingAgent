package com.tradingagent.manager;
import com.tradingagent.datasource.AlligatorIndexStubber;
import com.tradingagent.datasource.MarketDataStubber;
import com.tradingagent.datasource.OscillatorIndexStubber;
import com.tradingagent.entity.AskBid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Traning
{
	@Autowired
	private AlligatorIndexStubber alligatorIndexStubber;
	@Autowired
	private OscillatorIndexStubber oscillatorIndexStubber;
	@Autowired
	private MarketDataStubber marketDataStubber;

	public void performTrainingCycle()
	{
		AskBid currentAskBid = marketDataStubber.getAskBid();
		double currentAlligatorIndexValue = alligatorIndexStubber.getIndexValue();
		double currentOscillatorIndexValue = oscillatorIndexStubber.getIndexValue();

	}
}
