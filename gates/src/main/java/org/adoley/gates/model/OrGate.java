package org.adoley.gates.model;

public class OrGate implements Gates{
	public int orGate(int firstInput, int secondInput){
		if(firstInput==1 || secondInput==1)
			return 1;
		return 0; 	
	}
}
