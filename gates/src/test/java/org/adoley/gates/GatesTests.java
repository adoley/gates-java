package org.adoley.gates;

import org.adoley.gates.factory.GateFactory;
import org.adoley.gates.model.AndGate;
import org.adoley.gates.model.NotGate;
import org.junit.Test;

import junit.framework.Assert;

public class GatesTests {
	@Test
	public void testNotGate(){
		NotGate notGate=(NotGate)GateFactory.getGate("not");
		int result=notGate.notGate(1);
		Assert.assertEquals(0, result);
	}
	@Test
	public void testAndGate(){
		AndGate andGate=(AndGate)GateFactory.getGate("and");
		int result=andGate.andGate(1, 1);
		Assert.assertEquals(1, result);
	}
	
}
