package org.adoley.gates.model;

public class NorGate implements Gates{
	public int norGate(int firstInput,int secondInput){
		if(firstInput==0 && secondInput==0)
			return 1;
		return 0;
	}
}
