package hank;

public class hank09 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		System.out.println("OK");
		// if(a-->=10 && b-->=3)    10跟3都有大於跑進函式,各自減1 印出OK:a = 9 b = 2 *--擺後面後減
		// if(--a>=10 && --b>=3)	--擺前面 10-9變9,9沒大於10false 直接跳出來跑第二函式  印出XX:a = 9 b = 3
		//	if(a-->=10 || b-->=3)   10>10先跑第一個OR擇一,前面過就直接run印出來,所以OK:a = 9 b = 3 
		// if(--a>=10 || b-->=3)    一開始--a變9,沒跳出迴圈因為還有|| 後面有打於3 跳進去3--1 印出OK:a = 9 b = 2 
		if (a-- >= 10 | ++b <= 3) {
			System.out.printf("OK:a = %d b = %d \n",a,b);
		}else {
			System.out.printf("XX:a = %d b = %d \n",a,b);
		}

	}

}
