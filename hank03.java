package hank;

public class hank03 {

	public static void main(String[] args) {
		
		//intereger
		//byte ,short , int ,long
		//byte = 2^8  -128~127之間   2的8次方是256各取一半 負的128正的127之間
		
		byte var1 = 0;
		byte var2 = 126; 
	
		// 存取變數命名
		// [a-z , A-Z ,$,_] 第一個字可取這些開頭
		// [a-z ,A-Z ,0~9,_,$] 第二個字可用這些
		var2 ++;   //這邊加上去變127
		var2 ++;   //這邊加上去還是在範圍內便-128 其實++不是加的概念
		System.out.println(var2);

	}

}
