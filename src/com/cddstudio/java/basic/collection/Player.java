package com.cddstudio.java.basic.collection;

public class Player implements Comparable<Player> {

	private String name;

	private int goldMedal;
	private int silverMedal;
	private int bronzeMedal;

	public Player(String name, int goldMedal, int silverMedal, int bronzeMedal) {
		this.name = name;
		this.goldMedal = goldMedal;
		this.silverMedal = silverMedal;
		this.bronzeMedal = bronzeMedal;
	}

	// So sánh Player này với Player khác (other).
	// Giá trị trả về < 0 nghĩa là Player này < Player other.
	// Nếu trả về > 0 nghĩa là Player này > Player other
	// Nếu trả về 0 nghĩa là Player này = Player other.
	@Override
	public int compareTo(Player other) {
		// So sánh số huy chương vàng.
		int value = this.goldMedal - other.goldMedal;
		if (value != 0) {
			return value;
		}
		// So sánh số huy chương bạc.
		value = this.silverMedal - other.silverMedal;
		if (value != 0) {
			return value;
		}
		// So sánh số huy chương đồng.
		value = this.bronzeMedal - other.bronzeMedal;
		return value;
	}

	@Override
	public String toString() {
		return "[" + this.name + ", Gold: " + this.goldMedal + ", Silver: "
				+ this.silverMedal + ", Bronze: " + this.bronzeMedal + "]";
	}

}
