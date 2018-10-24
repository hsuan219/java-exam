package com.genesis.exams.slot;
import org.junit.Test;

public class SlotMachineTest {

	@Test
	public void test() {
		SlotMachine slotMachine = Common.init();
		Common.print(slotMachine.spin(100));
	}

}
