import java.util.Scanner;
public class b2_lab1 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập chiều dài: ");
		int dai = nhap.nextInt();
		System.out.print("Nhập chiều rộng: ");
		int rong = nhap.nextInt();
		System.out.println("Chu vi là: " + ((dai + rong)*2));
		System.out.println("Diện tích là: " + (dai * rong));
		System.out.println("Cạnh nhỏ nhất là :" + Math.min(dai, rong)); 
	}

}