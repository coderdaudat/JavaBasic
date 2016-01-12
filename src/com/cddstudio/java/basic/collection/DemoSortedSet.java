package com.cddstudio.java.basic.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class DemoSortedSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Tạo một đối tượng SortedSet thông qua class con TreeSet
		SortedSet<Player> players = new TreeSet<Player>();

		Player tom = new Player("Anh", 1, 3, 5);
		Player jerry = new Player("Dat", 3, 1, 3);
		Player donald = new Player("Thinh", 2, 10, 0);

		// Thêm các phần tử vào tập hợp
		// Chúng sẽ tự động được sắp xếp (Tăng dần).
		players.add(tom);
		players.add(jerry);
		players.add(donald);

		// In ra thông tin các phần tử.
		for (Player player : players) {
			System.out.println("Player: " + player);
		}

	}

}
