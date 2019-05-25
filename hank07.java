package hank;

public class hank07 {

	public static void main(String[] args) {
			// int score = Math.random();  因為用亂數出來是小數點,所以無法存到int
			// int score = (int)(Math.random()*30+40); 有30個數字,從40開始算起 40~69
			// int score = (int)(Math.random()*6+2); 有6個數字從2開始算起6個 2.3.4.5.6.7.
			int score = (int)(Math.random()*101); //乘上101就可從0.變成100 要括號包裹代表執行此函式 1~100隨機亂數出數字
			if(score>=80) {
				System.out.println("甲");
			}else if(score>=70) {
				System.out.println("乙");
			}else if(score>=60) {
				System.out.println("丙");
			}
			else {
				System.out.println("不及格");
			}
				System.out.println(score);
		
			
			
			
		

	}

}
