//
//  main.c
//  test
//
//  Created by  刘为红 on 2018/4/5.
//  Copyright © 2018年  刘为红. All rights reserved.
//

#include <stdio.h>
#include <string.h>
#define SIZE 6
void testArray(void);
void testConst(void);
void testPoint(void);
void testZeroAddress(void);
void testVoidPointer(void);
// 四种形式的数组函数原型
void printArray(int *,int);
void printArray(int *a,int size);
void printArray(int [],int);
void printArray(int a[],int size);
int sumWithPoint(int *,int *);
void pointOperation(void);

int main(int argc, const char * argv[]) {
    testArray();
    //testConst();
    //testPoint();
    //pointOperation();
    //testZeroAddress();
    //testVoidPointer();
    return 0;
}
void testArray(){
    //初始化数组
    int intArray[] = {1,2,3,4,5,6};
    printf("size of int intArray:%zd",sizeof intArray);
    putchar('\n');
    printArray(intArray, SIZE);
    int total = sumWithPoint(intArray, intArray+SIZE);
    putchar('\n');
    printf("total:%d",total);
    //根据初始化的数据自动确认数组的大小
    int days[] = {1,3,4,5,7,8};
    //C中没有直接像java那样的函数调用可以指定数组的长度
    //根据数组的总大小和单个元素的大小计算数组的长度
     putchar('\n');
    for (int i = 0; i<sizeof(days)/sizeof(days[i]); i++) {
        printf("days %d :%d",i,days[i]);
        putchar('\n');
    }
    //初始化部分
    int a;
    printf("aa %d\n",a);
    
}
/**
 *打印数组的元素
 */
void printArray(int *a,int size){
    putchar('\n');
    //a是指针变量，打印的是指针的大小
    printf("size of int *a:%zd",sizeof a);
    putchar('\n');
    for (int i = 0; i<size; i++) {
        printf("array element %d :%d",i,a[i]);
        putchar('\n');
    }
    
}
/**
 *通过指针移动和比较求和
 *end最后指向的最后一个元素的下一个位置，C保证在为数组分配存储空间的时候，指向数组
 *之后的第一个位置的指针是合法的
 */
int sumWithPoint(int *start,int *end){
    int total=0;
    while (start<end) {
        total+=*start;
        start++;
    }
    return total;
}
/**
 *可以对指针进行的操作
 */
void pointOperation(){
    int testArray[6] = {1,2,3,4,5,6};
    int *ptr1,*ptr2,*ptr3;
    //赋值操作
    ptr1 = testArray;//数组名就是数组的地址
    ptr2 = &testArray[2];
    printf("ptr+1:%d\n",*(ptr1+1));
    //*的优先级虽然很高，但是没有++高，先取ptr1地址，进行*运算，然后把ptr1+1
    printf("*ptr++1:%d\n",*ptr1++);
    printf("*ptr++2:%d\n",*ptr1++);
    //指针加法
    ptr3 = ptr1+4;
    //递增指针
    ptr1++;
    //递减指针
    ptr2--;
    //恢复
    ptr1--;
    ptr2++;
    //一个指针减去另一个指针
    long result = ptr2-ptr1;
    //指针可以做比较操作 <,>,>=,<=
}
/**
 *const的位置在*号前后决定了什么是常量，
 * const在*号前面面表示指针指向的变量的值不能修改
 * const在*号的后面表表示指针变量的值不能修改
 */
void testConst(){
    int i = 10;
    int j = 20;
    const int* p1=&i;
    int const* p2=&i;
    int *const p3=&i;
    //下面两种不正确
    //*p1=10;
    //*p2=20;
    *p3=30;
    printf("p3 alfter modify:%d\n", *p3);
    p1 =&j;
    p2=&j;
    printf("p1 and p3 alfter modify p1:%d,p2:%d\n", *p1,*p2);
    //p3=&j;
}

void testPoint(){
    int i = 10;
    int *p = &i;
    //取指针变量的值
    int temp = *p;
    printf("temp:%d\n",temp);
    //改变指针变量的地址存放的变量的值
     printf("p point value:%p\n",p);
     *p =20;
     printf("p point value:%p\n",p);
     printf("p value:%d\n",*p);
    //改变指针变量的值，即存放的地址值，指向另外一个变量
    int t = 90;
    p = &t;
    printf("p point value:%p\n",p);
    printf("p value:%d\n",*p);
}
void testZeroAddress(){
    int i = 10;
    int *p = &i;
    int *q;
    printf("q point value:%p\n",q);
    //不能访问0地址，指针没有赋值时就是0地址，不能对0地址进行操作
    //*q=20;
    *q++;
    printf("q point value:%p\n",q);
    //NULL指一个其值为0的指针
    if (q==NULL) {
        printf("0 zero address\n");
    }
}
void testVoidPointer(){
    //void 类型指针表示不知道指向什么东西的指针,计算时与char*相同，但不相通
    void * q;
    int *p;
    int i=0;
    p=&i;
    q=p;
    printf("q address:%p\n",q);
   
}
void testMaloc(){
    
}

