package org.adoley.gates.model;

public class NotGate implements Gates{
	public int notGate(int input){
		if(input==0)
			return 1;
		return 0;
	}
}
