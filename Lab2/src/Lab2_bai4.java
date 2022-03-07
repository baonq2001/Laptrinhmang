import java.util.Scanner;

public class Lab2_bai4 {
	public static void menu()
	{
		System.out.println("+-----------------------+");
		System.out.println("1. Giai PTB1");
		System.out.println("2. Giai BTB2");
		System.out.println("3. Tinh tien dien");
		System.out.println("4. Thoat");
		System.out.println("+-----------------------+");
		
		System.out.print("Chon chuc nang: ");
		Scanner nhap = new Scanner(System.in);
		
		int chon = nhap.nextInt();
		
		switch (chon) {
		case 1:
			Lab2_bai1.ptb1();
			break;
		case 2:
			Lab2_bai2.ptb2();
			break;
		case 3:
			Lab2_bai3.tiendien();
			break;
		case 4:
			break;
		default:
			System.out.println("Nhap sai!!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}

}