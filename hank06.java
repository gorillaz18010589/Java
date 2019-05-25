package hank;

public class hank06 {

	public static void main(String[] args) {
		byte var1 =10;
		long var2 =15;
		//byte va3 = var1 +var2; 這樣的方式因為long比較大 房子因該改成long如下
		long var3 = var1 +var2;
		System.out.println(var3);
		
		var1 = 125;
		byte var4 = var1++;
		System.out.println(var1);
		var1++;
		System.out.println(var1);
		var1++;
		System.out.println(var1);
		var1--;
		System.out.println(var1);
		var1 = 125;
		var1 += 3;
		System.out.println(var1);  // ++概念其實不是相加 他會照範圍繼續run下去
		
		var1=10; byte var6 =3;
		// float var5 = var1/var6;   // 10/3 float會是3.0  
		// int var5 = var1/var6;   // int結果是整數3 小數點去掉
		
		int var5 = (int)(var1/3f);  // 用int方式把結果算出來 但失去精準
		System.out.println(var5);
		
		int var7 = 3, var8 = 2;
		int var9 = var7^ var8;
		// 3 => 11; 2 => 10
		System.out.println(var9);
		
		//ava中有4個位運算，分別是“按位與&、按位或|、按位異或^，按位取反~”，它們的運算規則是：

		//按位與&：兩位全為1，結果為1

		//按位或|：兩位有一個為1，結果為1

		//按位異或^：兩位一個為0，一個為1，結果為1

		// 按位取反：0->1，1->0
		
	

	}

}
