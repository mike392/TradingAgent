package com.tradingagent.entity.impl;

import com.tradingagent.entity.TradingIndex;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class OscillatorIndex implements TradingIndex
{
	private double value;
}
