package com.genesis.exams.slot.impl;

import com.genesis.exams.slot.Evaluator;
import com.genesis.exams.slot.Symbol;

public class EvaluatorImpl implements Evaluator {

	@Override
	public long evaluate(Symbol[] symbols, long bet) {
	/*
		| A,A,A | 20  |
		| B,B,B | 20  |
		| C,C,C | 20  |
		| A,B,C | 30  |		
	 */
		StringBuilder sb = new StringBuilder();
		for(Symbol symbol : symbols){
			sb.append(symbol.getName());
		}
		long betMultiplier = 0;
		switch (sb.toString()){
			case "AAA":
			case "BBB":
			case "CCC":
				betMultiplier = 20;
				break;
			case "ABC":
				betMultiplier = 30;
				break;
			default:
				break;
		}
		return betMultiplier * bet;
	}

}
