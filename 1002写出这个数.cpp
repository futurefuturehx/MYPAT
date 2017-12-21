/*1002. 写出这个数 (20)

时间限制
400 ms
内存限制
65536 kB
代码长度限制
8000 B
判题程序
Standard
作者
CHEN, Yue
读入一个自然数n，计算其各位数字之和，用汉语拼音写出和的每一位数字。

输入格式：每个测试输入包含1个测试用例，即给出自然数n的值。这里保证n小于10100。

输出格式：在一行内输出n的各位数字之和的每一位，拼音数字间有1 空格，但一行中最后一个拼音数字后没有空格。

输入样例：
1234567890987654321123456789
输出样例：
yi san wu

update-v2.0:
string是类,printf()只能打印基本类型。
*/翻译一下就是输入一个多位数 求出各位上的数字之和 最后以拼音的形式输出求和结果
#include <iostream>
using namespace std;
int main() {
    string chinese[10] = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
    //用一个数组存储零到九的所有拼音
    string s;
    cin >> s;
    //接收从键盘键入的一个字符串
    int len = s.length();
    //将字符串的长度保存在len
    int sum = 0;//初始化一个sum用来存储求和结果
    for (int i = 0; i < len; i++) {
        sum = s[i] - '0' + sum;
    }
    //注意：这里通过ASCII码 将字符串上的各位与‘0’字符作差从而得到 Int类型的数值
    int *a = new int [len];
    //注意:这边左边是申明一个Int*型的指针a
    //右边动态申请len这么长的连续空间
    //=是将成功申请的空间的第一个元素的地址赋int*型指针a
    int t = 0;//这个t变量是用指针偏移的
    if (sum == 0) {
        cout << chinese[0];
        return 0;
    }
    //注意特殊情况特殊考虑 优化内存
    //这边总和是0就是特殊情况 直接输出0
    while (sum != 0) {
        a[t++] = sum % 10;
        sum = sum / 10;
    }
    //注意这边巧妙地使用指针偏移为各位赋值
    for (int i = t - 1; i >= 0; i--) {
        cout << chinese[a[i]];
        if(i != 0)
            printf(" ");
    }//注意这边通过数组的索引来进行了类似于映射般的效果
    //还得注意 这边为啥要反向循环 因为之前的a[]中存储的数值 本身就是最高位在最后 负负得正
    delete [] a;//释放a指针指向的全部内存空间
    return 0;
}


//以前写的方法。现在想来太傻了。。
#include <iostream>
#include <string>
using namespace std;
int main() {
    string s;
    cin >> s;
    int len = s.length();
    int *a = new int [len];
    int sum = 0;
    for (int i = 0; i < len; i++) {
        a[i] = s[i] - '0';
        sum = sum + a[i];
    }
    int *b = new int [len];
    int j = 0;
    if (sum == 0) {
        cout << "ling";
    }
    else {
        while (sum != 0) {
            b[j++] = sum % 10;
            sum = sum / 10;
        }
    }
    for (int i = j - 1;i >= 1; i--) {
        switch(b[i]) {
            case 1: cout << "yi ";break;
            case 2: cout << "er ";break;
            case 3: cout << "san ";break;
            case 4: cout << "si ";break;
            case 5: cout << "wu ";break;
            case 6: cout << "liu ";break;
            case 7: cout << "qi ";break;
            case 8: cout << "ba ";break;
            case 9: cout << "jiu ";break;
            case 0: cout << "ling ";break;
        }
    }
    switch(b[0]) {
        case 1: cout << "yi";break;
        case 2: cout << "er";break;
        case 3: cout << "san";break;
        case 4: cout << "si";break;
        case 5: cout << "wu";break;
        case 6: cout << "liu";break;
        case 7: cout << "qi";break;
        case 8: cout << "ba";break;
        case 9: cout << "jiu";break;
        case 0: cout << "ling";break;
    }
    delete [] a;
    delete [] b;
    return 0;
}