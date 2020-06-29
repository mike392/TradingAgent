package com.tradingagent.manager;

import com.google.common.collect.Lists;
import com.tradingagent.entity.Position;
import com.tradingagent.entity.impl.AlligatorIndex;
import com.tradingagent.entity.impl.OscillatorIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Component
public class TraningManager
{
	private List<Position> positions = new ArrayList<>();
	@Value("${granularity.index}")
	private int granularity;
	@Value("${alligator.hi}")
	private double alligHi;
	@Value("${alligator.lo}")
	private double alligLo;
	@Value("${oscillator.hi}")
	private double oscilHi;
	@Value("${oscillator.lo}")
	private double oscilLo;
	@Autowired
	private Traning training;

	public void performTraining()
	{
		initializePositions();


	}

	private void initializePositions()
	{
		List<Position> positions = new ArrayList<>();
		IntStream.range(0, granularity).forEach(alligVal -> {
			IntStream.range(0, granularity).forEach(oscilVal -> {
				positions.add(new Position()
				.setIndices(Lists.newArrayList(
					new AlligatorIndex().setValue(((alligHi-alligLo)/granularity) * alligVal),
					new OscillatorIndex().setValue(((oscilHi-oscilLo)/granularity) * oscilVal)
				)));
				System.out.println("added new position");
			});
		});
		this.positions = positions;
	}
}
