package org.adoley.gates.model;

public class XorGate implements Gates{
	public int xorGate(int firstInput,int secondInput){
		if(firstInput==secondInput)
		 	return 0;
		return 1;
	}
}
