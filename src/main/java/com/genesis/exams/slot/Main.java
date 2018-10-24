package com.genesis.exams.slot;

public class Main {
	public static void main(String[] args) {
		SlotMachine slotMachine = Common.init();
		Common.print(slotMachine.spin(100));
	}
}
