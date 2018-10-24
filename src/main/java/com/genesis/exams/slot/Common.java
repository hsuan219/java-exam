package com.genesis.exams.slot;

import com.genesis.exams.slot.impl.EvaluatorImpl;
import com.genesis.exams.slot.impl.SpinnerImpl;

public class Common {
	public static SlotMachine init(){
		Symbol a = new Symbol("A", 1);
		Symbol b = new Symbol("B", 1);
		Symbol c = new Symbol("C", 1);
		Symbol x = new Symbol("X", 2);
		Symbol y = new Symbol("Y", 3);
		Symbol z = new Symbol("Z", 4);
		
		Symbol[] symbols1 = {a, b, c, x, y, z};
		Symbol[] symbols2 = {z, y ,x, a, b, c};
		Symbol[] symbols3 = {a, b, c, x, y, z};
		
		Reel r1 = new Reel(symbols1);
		Reel r2 = new Reel(symbols2);
		Reel r3 = new Reel(symbols3);
		Reel[] reels = {r1, r2, r3};
		
		Spinner spinner = new SpinnerImpl();
		Evaluator evaluator = new EvaluatorImpl();
		SlotMachine sm = new SlotMachine(reels, spinner, evaluator);
		
		return sm;
	}
	
	public static void print(SpinResult result){
		StringBuilder sb = new StringBuilder();
		sb.append("| ");
		for(Symbol symbol : result.getSymbols()){
			sb.append(symbol.getName());
			sb.append(" | ");
		}
		System.out.println(sb.toString()+" Payout: "+result.getPayout());
	}
}
