package �����30212;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String args[])  {
		menu();
	}

	private static void menu() {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String e = new String();

		while (true) {
			System.out.println("�ϰ� ���� ����� �����ϼ���");
			System.out.println("1 : ���� ��� ");
			System.out.println("2 : ���� �˻� ");
			System.out.println("3 : ���� �߰� ");
			System.out.println("4 : ���� ���� ");
			System.out.println("5 : ��   ��");
			System.out.println("�Է� ���ּ��� : ");

			e = input.nextLine();

			switch (e) {

			case "1":
				System.out.println("��������� �����ϼ̽��ϴ�.");
				BookList();
				break;

			case "2":
				System.out.println("�����˻��� �����ϼ̽��ϴ�.");
				BookSearch();
				break;

			case "3":
				System.out.println("�����߰��� �����ϼ̽��ϴ�.");
				try {
					addbook();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				break;

			case "4":
				System.out.println("���������� �����ϼ̽��ϴ�.");
				Delbook();
				break;

			case "5":
				System.out.println("���α׷��� ����˴ϴ�.");
				System.exit(0);
				break;

			default:
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
				break;
			}

		}
	}

	public static void Delbook() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String e = new String();

		System.out.println("���� å �Է� : ");
		e = input.nextLine();

	}

	public static void BookSearch() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String e = new String();

		System.out.println("�˻��� å�� �Է��ϼ��� : ");

		System.out.println("å �̸� : ");
		e = input.nextLine();

	}

	public static void BookList() {
		Scanner input = new Scanner(System.in);
		String e = new String();

		System.out.println("å��� : ");
	}

	public static  void addbook() throws IOException {

		// book b = new book();

		Scanner scan = new Scanner(System.in);
		String name;
		int cost;
		
		System.out.println("å �̸� : ");
		name = scan.nextLine();

		System.out.println("å ���� :");
		cost = scan.nextInt();

		/*
		 * system.out.println("å ���ǻ� :"); e = input.nextLine();
		 * 
		 * System.out.println("å ���� :"); e = input.nextLine();
		 */
		BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\test\text"));
		bw.write(name + "\t" + cost);
	}

}
