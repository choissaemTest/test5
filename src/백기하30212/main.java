package 백기하30212;

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
			System.out.println("하고 싶은 기능을 선택하세요");
			System.out.println("1 : 도서 목록 ");
			System.out.println("2 : 도서 검색 ");
			System.out.println("3 : 도서 추가 ");
			System.out.println("4 : 도서 삭제 ");
			System.out.println("5 : 종   료");
			System.out.println("입력 해주세요 : ");

			e = input.nextLine();

			switch (e) {

			case "1":
				System.out.println("도서목록을 선택하셨습니다.");
				BookList();
				break;

			case "2":
				System.out.println("도서검색을 선택하셨습니다.");
				BookSearch();
				break;

			case "3":
				System.out.println("도서추가을 선택하셨습니다.");
				try {
					addbook();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				break;

			case "4":
				System.out.println("도서삭제을 선택하셨습니다.");
				Delbook();
				break;

			case "5":
				System.out.println("프로그렘이 종료됩니다.");
				System.exit(0);
				break;

			default:
				System.out.println("잘못 입력 하셨습니다.");
				break;
			}

		}
	}

	public static void Delbook() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String e = new String();

		System.out.println("지울 책 입력 : ");
		e = input.nextLine();

	}

	public static void BookSearch() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String e = new String();

		System.out.println("검색할 책을 입력하세요 : ");

		System.out.println("책 이름 : ");
		e = input.nextLine();

	}

	public static void BookList() {
		Scanner input = new Scanner(System.in);
		String e = new String();

		System.out.println("책목록 : ");
	}

	public static  void addbook() throws IOException {

		// book b = new book();

		Scanner scan = new Scanner(System.in);
		String name;
		int cost;
		
		System.out.println("책 이름 : ");
		name = scan.nextLine();

		System.out.println("책 저자 :");
		cost = scan.nextInt();

		/*
		 * system.out.println("책 출판사 :"); e = input.nextLine();
		 * 
		 * System.out.println("책 가격 :"); e = input.nextLine();
		 */
		BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\test\text"));
		bw.write(name + "\t" + cost);
	}

}
