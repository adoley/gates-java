package org.adoley.gates.factory;
import org.adoley.gates.model.*;

public class GateFactory {
	public static Gates getGate(String gate){
		if(gate.equalsIgnoreCase("not")){
			return new NotGate();
		}else if(gate.equalsIgnoreCase("and")){
			return new AndGate();
		}else if(gate.equalsIgnoreCase("nor")){
			return new NorGate();
		}else if(gate.equalsIgnoreCase("xor")){
			return new XorGate();
		}else if(gate.equalsIgnoreCase("or")){
			return new OrGate();
		}else{
			return null;
		}
	}
}
