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
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Entity e = new Entity();
		Thread t1 = new Thread(e);
		t1.setName("1");
		Thread t2 = new Thread(e);
		t2.setName("2");
		Thread t3 = new Thread(e);
		t3.setName("3");
		Map<String, String> sequence = new HashMap<String, String>();
		sequence.put("1", "2");
		sequence.put("2", "3");
		sequence.put("3", "1");
		e.setTurnSequence(sequence);
		t1.start();
		t2.start();
		t3.start();
	}

}
