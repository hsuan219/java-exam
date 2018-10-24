package com.genesis.exams.slot.impl;

import java.util.Random;

import com.genesis.exams.slot.Reel;
import com.genesis.exams.slot.Spinner;
import com.genesis.exams.slot.Symbol;

public class SpinnerImpl implements Spinner{

	@Override
	public Symbol spin(Reel reel) {
		int weightSum = 0;  
        for(Symbol symbol : reel.getSymbols()){  
        	weightSum += symbol.getWeight();  
        }  
	      
        int random = new Random().nextInt(weightSum);
        for(Symbol symbol : reel.getSymbols()){  
        	random -= symbol.getWeight();  
        	if (random < 0) {
        		return symbol;
        	}  
        }
        return null;
	}
}
