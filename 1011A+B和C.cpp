/*1011. A+B和C (15)
时间限制
100 ms
内存限制
65536 kB
代码长度限制
8000 B
判题程序
Standard
作者
HOU, Qiming
给定区间[-2^31, 2^31]内的3个整数A、B和C，请判断A+B是否大于C。

输入格式：

输入第1行给出正整数T(<=10)，是测试用例的个数。随后给出T组测试用例，每组占一行，顺序给出A、B和C。整数间以空格分隔。

输出格式：

对每组测试用例，在一行中输出“Case #X: true”如果A+B>C，否则输出“Case #X: false”，其中X是测试用例的编号（从1开始）。

输入样例：
4
1 2 3
2 3 4
2147483647 0 2147483646
0 -2147483648 -2147483647
输出样例：
Case #1: false
Case #2: true
Case #3: true
Case #4: false*/

#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        long long int a, b, c;
        //long long int中long long在内存中占八个字节 
        //long long int并不是所有编译器都支持 总之他不是标准类型
        //因为这边提出要求是2的32次方 所以使用long long int
        cin >> a >> b >> c;
        cout << "Case #" << i + 1 << ": ";
        if (a + b > c) {
            cout << "true";
        } else {
            cout << "false";
        }
        cout << endl;
    }
    return 0;
}
//这题只有类型要注意一下