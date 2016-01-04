/**
 * Code Unit 2
 */
package com.cddstudio.java;

public class Unit2 {

	/**
	 * Method - Phương thức - Hàm Chỉ khác tên gọi thực chất đều là 1
	 * Các chương trình java đều chạy vào hàm main đầu tiên
	 * cấu trúc một hàm gồm có
	 * - public là Access Modifier (Mức độ truy cập)
	 * - static ở đây là hàm static (khác với biến static):
	 *   + Đặc điểm của hàm static:
	 *   	* Chỉ phụ thuộc và lớp mà không phụ thuộc vào đối tượng
	 *      * Phương thức static chỉ có thể truy cập vào các thành phần static mà không thể truy cập vào các thành phần không static
	 *      * Phương thức static có thể truy cập trực tiếp bằng tên class mà không cần bất kỳ đối tượng nào.
	 * - void: là một kiểu kết quả của hàm nếu hàm này không trả về bất kì giá trị nào. (Tóm lại kiểu void thì không trả về kết quả)
	 * - main là tên hàm
	 * - String là đối tượng
	 * - String[] là mảng đối tượng String
	 * - args là tham số truyền vào
	 * ở hàm này JVM sẽ tự động tìm đến và chạy vào.
	 */
	public static void main(String[] args) {
		System.out.println("---------------TEST OPERATOR--------------");
		testOperator(); //Gọi hàm testOperator() để kiểm tra
		
		System.out.println();
		
		System.out.println("---------------TEST RELATIONAL OPERATION-----------");
		testRelationalOperation();
		
		System.out.println();
		
		System.out.println("---------------TEST LOGIC OPERATION-----------");
		testLogicOperation();
		
		System.out.println();
		
		System.out.println("---------------TEST BITWISE OPERATION--------------");
		testBitwiseOperation(); //Gọi hàm testBitwiseOperation() để kiểm tra
	}
	
	/**
	 * Cấu trúc hàm operator (operator nghĩa là toán tử):
	 * - private là Access Modifier (Mức độ truy cập)
	 * - static ở đây là hàm static giống như hàm main
	 * - void là một kiểu của hàm
	 * */
	private static void testOperator(){
		int a = 5; //Khai báo biến a kiểu int và gán bằng 5 (Tức giá trị của a bây giờ là = 5)
		//hàm println có trong hệ thống của java, khi gọi hàm này sẽ in ra kết quả (Xem ở Console trong eclipse)
		System.out.println("Biến a = "+a); 
		int b = 6; //Khai báo biến b kiểu int và gán bằng 6 (Tức giá trị của b bây giờ là = 6)
		System.out.println("Biến b = "+b); 
		
		int c = a + b; //Khai báo biến c kiểu int và gán c bằng tổng của hai toán hạng a với b
					  // (Giá trị của c bây giờ bằng 11)
		System.out.println("Tổng của a + b = " + c); 
		
		c = a - b; //Gán c = hiệu của hai toán hạng a và b (Giá trị c = -1)
		System.out.println("Hiệu của a - b = " + c); 
		
		c = a * b; //Gán c = tích của hai toán hạng a và b (Giá trị c = 30)
		System.out.println("Tích của a * b = " + c);
		
		c = b / a; //Gán c = thương của hai toán hạng a và b (Giá trị c = 1 do phép chia này lấy nguyên)
		System.out.println("Thương của b / a = " + c);
		
		c = b % a; //Gán c = phần dư của hai toán hạng a và b (Giá trị c = 1);
		System.out.println("Phần dư b % a = " + c);
		
		int d = 7; //Khai báo biến d kiểu int và gán = 7;
		System.out.println("Biến d = " + d);
		
		d ++; //Biến d tăng thêm 1 đơn vị (d = 8);
		System.out.println("Giá trị của d sau khi tăng lên là = " + d);
		
		d --; //Biến d giảm đi 1 đơn vị (d = 7);
		System.out.println("Giá trị của d sau khi giảm đi là = " + d);
		
		d += a;//Cộng d với a rồi gán vào d (d = 12)
		System.out.println("Giá trị của d sau khi thực hiện phép toán d += a là = " + d);
		
		d -= a;//Trừ d cho a rồi gán vào d (d = 7)
		System.out.println("Giá trị của d sau khi thực hiện phép toán d -= a là = " + d);
		
		d *= a;//Nhân d với a rồi gán vào d (d = 35)
		System.out.println("Giá trị của d sau khi thực hiện phép toán d *= a là = " + d);
		
		d /= a;//Chia d cho a rồi gán vào d (d = 7)
		System.out.println("Giá trị của d sau khi thực hiện phép toán d /= a là = " + d);
		
		d %= a; //Chia d cho a rồi gán phần dư vào d (d = 2)
		System.out.println("Giá trị của d sau khi thực hiện phép toán d %= a là = " + d);
	}
	
	private static void testRelationalOperation(){
		int a = 5;//Khai báo biến a kiểu int và gán giá trị bằng 5
		int b = 6;//Khai báo biến b kiểu int và gán giá trị bằng 6
		System.out.println("So sánh a == b ? " + (a == b));
		System.out.println("So sánh a != b ? " + (a != b));
		
		System.out.println("So sánh a > b ? " + (a > b));
		System.out.println("So sánh a >= b ? " + (a >= b));
		
		System.out.println("So sánh a < b ? " + (a < b));
		System.out.println("So sánh a <= b ? " + (a <= b));
	}
	
	private static void testLogicOperation(){
		int a = 5;//Khai báo biến a kiểu int và gán giá trị bằng 5
		int b = 6;//Khai báo biến b kiểu int và gán giá trị bằng 6
		boolean isResult = (a == 5) && (b == 3);//Khai báo biến isResult kiểu boolean
												// giá trị của isResult được tính sau khi so sánh a == 5 và b == 3
		System.out.println("Giá trị của isResult sau khi so sánh && " + isResult);
		
		isResult = (a == 5) | (b == 3);
		System.out.println("Giá trị của isResult sau khi so sánh | " + isResult);
		
		isResult = (a == 5) ^ (b == 3);
		System.out.println("Giá trị của isResult sau khi so sánh ^ " + isResult);
		
		isResult = !(a == 5);
		System.out.println("Giá trị của isResult sau khi so sánh ! " + isResult);
	}

	private static void testBitwiseOperation(){
		int a = 5; //Khai báo biến a kiểu int và gán giá trị bằng 5.
		System.out.println("Khai báo a = " + a);
		
		a = ~a;//Phủ định(NOT) của a = -a -1 (Kết quả = -5 -1 = -6)
		System.out.println("Phủ định bit ~a = " + a);
		
		a = 5;//Gán lại cho a = 5
		int b = 3;// Khai báo biến b kiểu int và gán b bằng 6;
		int c = a&b;//Kết quả giá trị c = 1.
		/**
		 * Tại sao giá trị c lại = 1 ????
		 * Toán tử thao tác bit AND lấy 2 toán hạng nhị nhân có chiều dài bằng nhau và thực hiện phép toán lí luận AND 
		 * trên mỗi cặp bit tương ứng bằng cách nhân chúng lại với nhau. 
		 * Nhờ đó, nếu cả 2 bit ở vị trí được so sánh đều là 1, thì bit hiển thị ở dạng nhị phân sẽ là 1 (1 x 1 = 1); 
		 * ngược lại thì kết quả sẽ là 0 (1 x 0 = 0).
		 * 
		 * VD: 
		 * a    b     a&b
		 * 0    0      0
		 * 0    1      0
		 * 1    0      0
		 * 1    1      1
		 * 
		 * a = 5(Biểu diễn nhị phân là : 0011)
		 * b = 3(Biểu diễn nhị phân là : 0101)
		 * a&b = 1(Biểu diễn nhị phân là: 0001)
		 * 
		 * */
		System.out.println("AND bit a&b = " + c);
		
		c = a ^ b;//Giá trị của c = 6
		/**
		 * Phép toán thao tác bit XOR lấy hai dãy bit có cùng độ dài và thực hiện phép toán logic bao hàm OR trên mỗi cặp bit tương ứng. 
		 * Kết quả ở mỗi vị trí là 1 chỉ khi bit đầu tiên là 1 hoặc nếu chỉ khi bit thứ hai là 1, 
		 * nhưng sẽ là 0 nếu cả hai là 0 hoặc cả hai là 1. 
		 * Ở đây ta thực hiện phép so sánh hai bit, kết quả là 1 nếu hai bit khác nhau và là 0 nếu hai bit giống nhau.
		 * (cách nhớ dễ nhất là: 2 bit giống nhau trả về 0, 2 bit khác nhau trả về 1)
		 * 
		 * VD:
		 * a     b     a^b
		 * 0     0      0
		 * 0     1      1
		 * 1     0      1
		 * 1     1      0
		 * 
		 * a = 5(Biểu diễn nhị phân là : 0011)
		 * b = 3(Biểu diễn nhị phân là : 0101)
		 * a^b = 6(Biểu diễn nhị phân là: 0110)
		 */
		System.out.println("XOR bit a ^ b = " + c);
		
		c = a >> 1; //Dịch sang phải 2 bit
		/**
		 * a = 5 (Biểu diễn nhị phân là : 0011)
		 * Dịch sang phải 1 bit thành 0010 (2)
		 * Dịch sang phải 2 bit thành 0001 (1)
		 * 
		 * */
		System.out.println("Biến a dịch sang phải 1 bit có giá trị = " + c);
		
		c = a << 1; //Dịch sang trái 1 bit
		/**
		 * a = 5 (Biểu diễn nhị phân là : 0011)
		 * Dịch sang trái 1 bit thành 0110 (10)
		 * Dịch sang phải 2 bit thành 1100 (20)
		 * 
		 * */
		System.out.println("Biến a dịch sang trái 1 bit có giá trị = " + c);
	}
}
