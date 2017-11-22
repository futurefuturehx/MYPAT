package study;
import java.util.Scanner;
public class 猜想{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		//nextInt只读取整数类型 焦点不会换行
		//next()读取输入直到空格 读取之后 焦点不会换行
		//nextLine()读取包括空格直到换行 焦点会换行
		int number=in.nextInt();
		//Scanner的close()是关闭输入流 释放空间
		in.close();
		//这边的int cnt=0的cnt变量是计数器 用来统计除以二的次数
		int cnt=0;
		//这边while (number!=1)是让不断循环除直到等于1
		while(number!=1){
			//这边if(number%2！=0)是指如果不是偶数
			if(number%2!=0){
				number=3*number+1;
			}
			number/=2;
			cnt++;
		}
		System.out.println(cnt);
	}
}
