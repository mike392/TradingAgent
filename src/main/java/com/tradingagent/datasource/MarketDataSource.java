package com.tradingagent.datasource;

import com.tradingagent.entity.AskBid;

public interface MarketDataSource
{
	AskBid getAskBid();
}
