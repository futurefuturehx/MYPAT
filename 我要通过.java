package study;
import java.util.Scanner;
public class 我要通过 {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		String str[]=new String[n];
		//用数组的每一个元素接收一个键入数值 空格是next()的结束标志
		for(int i=0;i<n;i++) {
			str[i]=scanner.next();
		}
		scanner.close();
		for(int i=0;i<n;i++) {
			System.out.println(StrTrueOrFalse(str[i]));
		}
}
	public static String StrTrueOrFalse(String s) {
		//三个变量分别用来统计P A T的数量 如果P A T的数量之和等于length()的值则说明没有其他字母
		//注意length()只统计字符 不包括空格
		int NumA=0,NumP=0,NumT=0;
		//这两个变量分别记录P和T的位置
		int PosP=0,PosT=0;
		//每当charAt到的字符与这三个字符一致 对应的计数器加一
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A') {
			NumA++;
			}
			if(s.charAt(i)=='P') {
				NumP++;
				PosP=i;
			}
			if(s.charAt(i)=='T') {
			NumT++;
			PosT=i;
			}
			//如果三个字符的数量总和等于字符串的长度并且P与T的字符数都是一并且P与T的距离大于一并且P与T的距离乘以P前面的A的个数等于T后面的A的个数
			//那么就是正确的 狗则返回错误信息
		}if(NumA+NumP+NumT==s.length()&&NumA!=0&&NumP==1&&NumT==1&&PosT-PosP>1&&PosP*(PosT-PosP-1)==s.length()-PosT-1) {
			return"YES";
		}else {
			return"NO";
		}
	}
}
