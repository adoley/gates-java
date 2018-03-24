package org.adoley.gates.model;

public class AndGate implements Gates{
	public int andGate(int firstInput,int secondInput){
		if(firstInput ==0 || secondInput==0)
			return 0;
		return 1;
	}
}
