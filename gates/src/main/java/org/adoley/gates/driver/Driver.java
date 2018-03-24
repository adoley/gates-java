package org.adoley.gates.driver;
import java.util.Scanner;

import org.adoley.gates.factory.GateFactory;
import org.adoley.gates.model.AndGate;
import org.adoley.gates.model.NorGate;
import org.adoley.gates.model.NotGate;
import org.adoley.gates.model.XorGate;

public class Driver {
	
	public static void main(String[] args){
		int result,a,b,loop=1,notA,notB,andOutput,norOutput;
		Scanner scanner=new Scanner(System.in);
		   while(loop==1){
		    
		        System.out.println(" Enter the value of A : ");
		        a=scanner.nextInt();
		        System.out.println("Enter the value of B : ");
		        b=scanner.nextInt();
		        
			if(a>=0 && a<=1 && b>=0 && b<=1){

				//Here you define your circuit
		    	NotGate notGate=(NotGate) GateFactory.getGate("not");    //use not gate  
				notA=notGate.notGate(a);
		    	notB=notGate.notGate(b);
		    	AndGate andGate=(AndGate) GateFactory.getGate("and");
				andOutput=andGate.andGate(notA,notB); // use and gate
				NorGate norGate=(NorGate) GateFactory.getGate("nor");
				norOutput=norGate.norGate(a,b); //use nor gate
				XorGate xorGate=(XorGate) GateFactory.getGate("xor");
				result=xorGate.xorGate(andOutput,norOutput); //use xor gate
				//circuit definition ends
		    		
				System.out.println("The output the circuit : "+result);
			}else{
				System.out.println("Value of A & B should be either 1 or 0 \n");
			}

			System.out.println("Press 1 to continue or press any other key to exit : ");
		    	loop=scanner.nextInt();
		     }
	}
}
