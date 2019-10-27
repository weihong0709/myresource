//
//  FriendTest.hpp
//  cplustest
//
//  Created by  刘为红 on 2019/9/1.
//  Copyright © 2019年  刘为红. All rights reserved.
//

#ifndef FriendTest_hpp
#define FriendTest_hpp
#include <iostream>
#include <stdio.h>

#endif /* FriendTest_hpp */
class Demo2{
private:
    int temp;
public:
    void modifyDemo(){
        
    }
};
class Demo{
private:
    int a;
    /**
     *友元类，友元不能传递
     */
    friend Demo2 ;
public:
    Demo(int i){
        a=i;
        std::cout<< "create demo " << i<<"\n";
    }
    ~Demo(){
        std::cout<<"demo"<<a<<" destructed\n";
    }
    void testThis();
    /**
     *常量成员函数，不能修改类的成员变量，静态变量除外
     */
    void constMethod() const{
        
    }
    /**
     *友元函数
     */
    friend void modifyDemo(Demo & demo);
};
