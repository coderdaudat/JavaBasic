package com.cddstudio.java.basic;

public class Unit4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testSex(true);
		testDivisible();
		testSwitchCase();
		testWhile();
		testDoWhile();
		testFor();
	}

	// Method testSex có đối số truyền vào là isSex kiểu boolean
	private static void testSex(boolean isSex) {
		if (isSex) { // Kiểm tra xem biến isSex là TRUE hay FALSE
			System.out.println("MALE"); // TRUE sẽ in ra dòng chữ MALE
		} else {
			System.out.println("FEMALE"); // FALSE sẽ in ra dòng chữ FEMALE
		}
	}

	private static void testDivisible() {
		int a = 8;
		if (checkDivisibleByTwo(a)) {
			System.out.println("Divisible by 2");
		} else if (checkDivisibleBySix(a)) {
			System.out.println("Divisible by 6");
		} else {
			System.out.println(":(((");
		}
	}

	// Method checkDivisibleByTwo kiểm tra một số có chia hết cho 2 hay không
	private static boolean checkDivisibleByTwo(int a) {
		return a % 2 == 0;
	}

	// Method checkDivisibleBySix kiểm tra một số có chia hết cho 6 hay không
	private static boolean checkDivisibleBySix(int a) {
		return (a % 2 == 0 && a % 3 == 0);
	}

	private static void testSwitchCase() {
		int choose = 4;
		switch (choose) { // Biến choose chứa 1 giá trị xác định (trong trường
							// hợp này là 4)
		case 0: // 0 là hằng số
			System.out.println("NUMBER 0"); // Nếu giá trị choose bằng 0 thì sẽ
											// in ra dòng này
			break; // Thoát khỏi luồng rẽ nhánh
		case 1:
			System.out.println("NUMBER 1");
			break;

		case 2:
			System.out.println("NUMBER 2");
			break;

		default: // Nếu không vào các case(trường hợp) nào thì sẽ vào giá trị
					// mặc định
			System.out.println("I DON'T KNOW");
			break;
		}
	}

	private static void testWhile() {
		int i = 0;
		while (i < 100) { // Kiểm tra xem i có nhỏ hơn 1000 hay không
			System.out.println("I = " + i); // Nếu i nhỏ hơn sẽ in ra dòng này
			i++; // Tăng giá trị của i
		}
	}

	private static void testDoWhile() {
		int i = 0;
		do {
			System.out.println("I = " + i);
			i++;
		} while (i < 100);
		// Với điệu kiện như vậy thì đoạn code này giống y đúc method testWhile
		// Nhưng nếu ta đổi điều kiện thì sẽ có sự khác biệt

		int a = 5;
		// với vòng lặp này thì khối lệnh được in ra 2 lần
		do {
			System.out.println("A = " + a);
			a++;
		} while (checkDivisibleByTwo(a));

		a = 5; // Gán lại biến a để test
		// Cách này thì k in ra lần nào
		while (checkDivisibleByTwo(a)) {
			System.out.println("B = " + a);
		}
	}

	private static void testFor() {
		int array[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // Khai báo mảng int gồm
														// 10 số
		int sum = 0; // Khai báo biến sum kiểu int

		// Cách dùng vòng lặp for thứ nhất
		for (int i = 0; i < array.length; i++) {// Khởi tạo biến i kiểu int làm
												// chỉ số duyệt mảng
												// Kiểm tra biến i nhỏ hơn độ
												// dài của mảng thì vẫn tiếp tục
												// lặp
												// Sau khi thực hiện hết các
												// lênh trong 1 vòng lặp thì
												// tăng giá trị i lên 1 đơn vị
			sum += array[i]; // Mỗi vòng lặp lại cộng giá phần tử của mảng vào
								// biến sum.
		}
		System.out.println("SUM 1 = " + sum);

		sum = 0; // Reset lại biến sum về giá trị 0

		/*
		 * Cách dùng vòng lặp for thứ 2Về bản chất thì cách 2 giống cách 1, điểm
		 * khác biết là cách này khai báo thêm một biến n kiểu intđể xác định độ
		 * dài của mảng ngay từ ban đầu (cách 1 thì cứ mỗi vòng lặp lại phải xác
		 * định độ dài của mảng)Bởi vậy cách 2 có tốc độ thực thi nhanh hơn cách
		 * 1.
		 */
		for (int i = 0, n = array.length; i < n; i++) {
			sum += array[i];
		}
		System.out.println("SUM 2 = " + sum);

		/*
		 * Cách dùng vòng lặp for thứ 3 Một cách duyệt mảng khác trong vòng lặp
		 * cách này rút gọn code hơn, tối ưu hơn khuyến khích nên dùng
		 */
		sum = 0; // Reset lại biến sum về giá trị 0
		for (int i : array) { // Khởi tạo biến i kiểu int, mỗi vòng lặp biến i
								// được gắn bằng giá trị lần lượt trong mảng
			sum += i;
		}
		System.out.println("SUM 3 = " + sum);

		// Cách sử dụng vòng lặp thứ 4
		sum = 0; // Reset lại biến sum về giá trị 0
		for (int i = array.length - 1; i >= 0; i--) {
			sum += array[i];
		}
		System.out.println("SUM 4 = " + sum);

		/*
		 * So sánh tốc độ thực thi Cách 3 > Cách 4 > Cách 2 > Cách 1 Cách 4
		 * nhanh hơn cách 2 là bởi vì, cách 2 so sánh với số n, cách 4 so sánh
		 * với số 0 Ngôn ngữ lập trình nào cũng vậy so sánh với số 0 sẽ nhanh
		 * hơn.
		 */

		// Tùy biến các vòng lặp
		sum = 0; // Reset lại biến sum về giá trị 0
		for (int i = 0, n = array.length; i < n; i += 2) { // Chỉ số i tăng lên
															// 2 đơn vị
			sum += array[i];
		}
		System.out.println("SUM 5 = " + sum);
	}

	// Tạo lớp cơ bản
	class SuperClass {
		int a;

		// constuctor (khởi tạo không tham số)
		public SuperClass() {
		}

		// overloaded constructor (Nạp chồng constructor)
		SuperClass(int b) {
			a = b;
		}

		public void message() {
			System.out.println("In the super class");
		}
	}

	class SubClass extends SuperClass {
		int a;

		SubClass(int a) {// subclass constructor
			this.a = a;
		}

		@Override  //Như vậy là đã ghi đè phương thức message của lớp cha
		public void message() {
			// TODO Auto-generated method stub
			super.message();
		}
	}

}
