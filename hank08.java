package hank;

public class hank08 {

	public static void main(String[] args) {
		int year = 2019;
		if((year % 4 ==0 && year % 100 != 0)||year % 400 ==0 && year % 3200 != 0) {
		System.out.println("此為閏年");
		}else{
		System.out.println("此為平年");
		}
		

	}

}
