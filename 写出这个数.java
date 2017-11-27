package study;
import java.util.Scanner;
import java.util.Stack;
public class 写出这个数 {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		String n=in.nextLine();
    //注意这边是把扫描器关闭 并不是把变量n关闭
		in.close();
		int sum=0;
		for(int i=0;i<n.length();i++) {
    //charAt()用于返回指定索引处的字符
    //这边就是把各位上的字符与'0'字符作差 结果再相加
			sum+=n.charAt(i)-'0';
		}
    //栈是先进后出正好适合输出格式
    //这边<String>是指这个容器只能存放String类型的数据
		Stack<String>stack=new Stack<>();
    //执行直到商变成零
		do {
    //这边取得余数
			int unit=sum%10;
      //push()压入
			switch(unit) {
			case 0:
				stack.push("ling");
				break;
			case 1:
				stack.push("yi");
				break;
			case 2:
				stack.push("er");
				break;
			case 3:
				stack.push("san");
				break;
			case 4:
				stack.push("si");
				break;
			case 5:
				stack.push("wu");
				break;
			case 6:
				stack.push("liu");
				break;
			case 7:
				stack.push("qi");
				break;
			case 8:
				stack.push("ba");
				break;
			case 9:
				stack.push("jiu");
				break;
			}
      //而这边取商
			sum/=10;
		}while(sum!=0);
    //用pop()弹出
		System.out.print(stack.pop());
    //只要栈不空 就一直弹出
		while(!stack.isEmpty()) {
			System.out.print(" "+stack.pop());
		}
	}
}
