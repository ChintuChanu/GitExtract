package org.cnt;

public class CntrlStmt {

	public static void main(String[] args) {
		int lokiAge=27,balaAge=28,mohanAge=30;
		if(lokiAge>balaAge && lokiAge>mohanAge) {
			System.out.println("loki is the eldest one");
		}
		else if(balaAge>lokiAge && balaAge>mohanAge){
			System.out.println("bala is the eldest one");
			
		}
		else {
			System.out.println("mohan is the eldest  one");
		}

	}

}
