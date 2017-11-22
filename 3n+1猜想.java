package study;
import java.util.Scanner;
public class 猜想{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		//nextInt只读取整数类型 焦点不会换行
		next()读取输入直到空格 读取之后 焦点不会换行
		nextLine()读取包括空格 读取之后 焦点会换行
		int number=in.nextInt();
		in.close();
		int cnt=0;
		while(number!=1){
			if(number%2!=0){
				number=3*number+1;
			}
			number/=2;
			cnt++;
		}
		System.out.println(cnt);
	}
}
