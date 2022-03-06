import java.util.Scanner;
public class b4_lab1 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập biến a: ");
		float a = nhap.nextInt();
		System.out.print("Nhập biến b: ");
		float b = nhap.nextInt();
		System.out.print("Nhập biến c: ");
		float c = nhap.nextInt();
		float delta =b*b- 4*a*c;
		System.out.println("Căn bậc hai delta là: " + Math.sqrt(delta));
	}

}