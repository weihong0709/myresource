//
//  main.cpp
//  cplustest
//
//  Created by  刘为红 on 2019/8/29.
//  Copyright © 2019年  刘为红. All rights reserved.
//

#include <iostream>
#include "PolymorphismTest.hpp"
#include "FriendTest.hpp"

#define endl "\n";

void modifyDemo(Demo & demo){
    demo.a=8;
    std::cout<<"friend method:"<<demo.a<<endl;
}

/**
 *this 指向方法对应的对象的指针
 */
void Demo::testThis(){
    std::cout<<"test this:"<<this->a<<endl;
}
void testRefence();
void testMemoryAllocate();
void testInline();
int main(int argc, const char * argv[]) {
    // insert code here...
    std::cout << "Hello, World!\n";
    Demo d(2);
    d=4;
    d.testThis();
    Demo & demo = d;
    modifyDemo(demo);
    testRefence();
    testMemoryAllocate();
    testInline();
    testPolymorphismWithPointer();
    testPolymorphismWithReference();
    return 0;
}
void testRefence(){
    int a=4;
    int & b=a;
    std::cout<<b<<endl;
    b=5;
    std::cout<<a<<endl;
}
 void testMemoryAllocate(){
    //new 返回的都是指针
    int *a= new int;
    *a=6;
    std::cout<<*a<<endl;
    delete a;
    int *b = new int[7];
    b[0] = 7;
   std::cout<<b[0]<<endl;
    delete [] b;
}
/**
 内联函数
 */
inline void testInline(){
    std::cout<<"inline test"<<endl;
}

