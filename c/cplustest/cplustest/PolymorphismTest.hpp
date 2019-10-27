//
//  PolymorphismTest.hpp
//  cplustest
//
//  Created by  刘为红 on 2019/9/1.
//  Copyright © 2019年  刘为红. All rights reserved.
//

#ifndef PolymorphismTest_hpp
#define PolymorphismTest_hpp

#include <stdio.h>
#include "iostream"
#endif /* PolymorphismTest_hpp */
using std::cout;
using std::endl;
class CBase{
public:
    virtual void someVirtualFunction(){
        cout<<"CBase virtual method invoke"<<endl;
    }
    void someFunction(){
        cout<<"CBase method invoke"<<endl;
    }
};
class CDrived:public CBase{
public:
    virtual void someVirtualFunction(){
        cout<<"CDrived virtual method invoke"<<endl;
    }
    void someFunction(){
        cout<<"CDrived method invoke"<<endl;
    }
};
/**
 C++通过虚方法实现多态，非虚方法指针或者引用是什么类型就调用对应类型的方法，虚方法会根据实际赋值的类型动态调用对应的方法
 java里面的abstract的方法跟虚函数作用不一样
 java是所有方法，只要子类存在，就会有多态的效果，C++为什么不能像java这样实现？
 多态的实现关键：虚函数表，包含虚函数的对象都有一个虚函数表的指针，存放虚函数表对应的地址
 */
void testPolymorphismWithPointer(){
    CDrived cdrived;
    CBase * cdrivedPointer = &cdrived;
    cdrivedPointer->someVirtualFunction();
    cdrivedPointer->someFunction();
    CBase cbase;
    CBase * cbasePointer = &cbase;
    cbasePointer->someVirtualFunction();
    cbasePointer->someFunction();
}
void testPolymorphismWithReference(){
    CDrived cdrived;
    CBase & cdrivedReference = cdrived;
    cdrivedReference.someVirtualFunction();
    cdrivedReference.someFunction();
    CBase cbase;
    CBase & cbaseReference = cbase;
    cbaseReference.someVirtualFunction();
    cbaseReference.someFunction();
}

