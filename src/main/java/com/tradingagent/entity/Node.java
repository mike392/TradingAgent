package com.tradingagent.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Node
{
	private final Position position;
	private final Action action;
	private double weight;
}
