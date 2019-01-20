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
// 四种形式的数组函数原型
void printArray(int *,int);
void printArray(int *a,int size);
void printArray(int [],int);
void printArray(int a[],int size);
int sumWithPoint(int *,int *);
void pointOperation(void);

int main(int argc, const char * argv[]) {
    testArray();
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
    //根据数组的总大小和单个元素的大小计算数组的长度
     putchar('\n');
    for (int i = 0; i<sizeof(days)/sizeof(days[i]); i++) {
        printf("days %d :%d",i,days[i]);
        putchar('\n');
    }
    //初始化部分
    
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
void pointOperation(){
    int testArray[6] = {1,2,3,4,5,6};
    int * ptr1,*ptr2,*ptr3;
    //赋值操作
    ptr1 = testArray;
    ptr2 = &testArray[2];
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
    
    
}


