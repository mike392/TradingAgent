package com.tradingagent.entity;

import com.tradingagent.entity.impl.AlligatorIndex;
import com.tradingagent.entity.impl.OscillatorIndex;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Position
{
	private List<TradingIndex> indices;
}
