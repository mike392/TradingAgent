package com.tradingagent.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
@Data
@Accessors(chain = true)
public class NodeList
{
	private List<Node> nodes;
	private Position position;
}
