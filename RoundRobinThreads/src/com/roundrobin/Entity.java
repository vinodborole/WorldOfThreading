/**
 * 
 */
package com.roundrobin;

import java.util.HashMap;
import java.util.Map;

/**
 * @author VINOD
 *
 */
public class Entity implements Runnable {
	volatile Integer i = 0;
	volatile String turn = "1";
	Map<String, String> sequence = new HashMap<String, String>();

	@Override
	public void run() {
		while (i < 10) {
			if (Thread.currentThread().getName().equalsIgnoreCase(turn)) {
				System.out.println("Thread: "
						+ Thread.currentThread().getName() + " --- " + i);
				i++;
				turn = getNextTurn(turn);
			}
		}
	}

	public void setTurnSequence(Map<String, String> sequence) {
		this.sequence = sequence;
	}

	private String getNextTurn(String currentTurn) {
		return sequence.get(currentTurn);
	}

}
