package com.tradingagent.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AskBid
{
	private double ask;
	private double bid;

	public AskBid(double ask, double bid) {
		this.ask = ask;
		this.bid = bid;
	}
}
