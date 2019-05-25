package hank;

public class hank05 {

	public static void main(String[] args) {
		// float = 2^32
		// double = 2^64
		  float var1 = 12.3f;
		  double var2 = 12.3d;
		  float var3 = 12;
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		boolean var4 = true;  // 不然就是false;
		System.out.println(var4);
		
		// 2^16 => unsign => 0 ~ 65535
		char var5='爽';     // char後面要用單引號
		char var6=58;     // char如果要放數字最大放到65  印出 ASCII code a=>97
		System.out.println(var5);
		System.out.println(var6);
		
		System.out.println("Hello, World".charAt(4)); // chart(4)=從0字元h開始屬到4抓到O


	}

}
