package study;
//这个包的这个类提供静态方法动态创建数组
//静态方法是使用公共内存空间的
//就是说所有对象都可以直接引用，不需要创建对象再使用该方法
//动态数组不指定大小 可以根据用户需要灵活变动大小
//Array与Arrays的区别？：
//Array是个工具类 是用来操作数组的 Arrays主要用来存储数据
//工具类都是static的 不需要使用类的对象去调用 哪里用调用哪里
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;
public  class basic1005{
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		int k=in.nextInt();
		int[]n=new int[k];
		@SuppressWarnings("rawtypes")
		TreeSet[]treeSets=new TreeSet[k];
		for(int i=0;i<k;i++) {
			n[i]=in.nextInt();
			treeSets[i]=new TreeSet<Integer>(getNumber(n[i]));
		}
		in.close();
		LinkedList<Integer>list=new LinkedList<Integer>();
		for (int i=0;i<k;i++) {
			if(isMajor(n[i],treeSets,i)) {
				list.add(n[i]);
			}
		}
		int[]array=new int[list.size()];
		for(int i=0;i<array.length;i++) {
			array[i]=list.get(i);
		}
		Arrays.sort(array);
		for(int i=array.length-1;i>0;i--) {
			System.out.print(array[i]+" ");
		}
		System.out.print(array[0]);
	}
	public static boolean isMajor(int n,@SuppressWarnings("rawtypes")TreeSet[] treeSets,int index) {
		for(int i=0;i<treeSets.length;i++) {
			if(i!=index&&treeSets[i].contains(n)) {
				return false;
			}
		}
		return true;
	}
	public static TreeSet<Integer>getNumber(int n){
		TreeSet<Integer>treeSet=new TreeSet<Integer>();
		treeSet.add(n);
		while(n!=1) {
			if(n%2==0) {
				n=n/2;
			}else {
				n=(3*n+1)/2;
			}
			treeSet.add(n);
		}
		return treeSet;
	}
}
