package com.tradingagent.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class Network
{
	private Map<Position, NodeList> network;
}
