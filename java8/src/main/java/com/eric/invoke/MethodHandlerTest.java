package com.eric.invoke;

import javax.swing.text.html.FormSubmitEvent;
import java.lang.invoke.MethodHandle;
import static java.lang.invoke.MethodHandles.lookup;

import java.lang.invoke.MethodType;

public class MethodHandlerTest {

    private static MethodHandle getPrintMehthondHandler(Object object) throws NoSuchMethodException, IllegalAccessException {
        MethodType methodType= MethodType.methodType(void.class,String.class);
        return lookup().findVirtual(object.getClass(),"println",methodType).bindTo(object);
    }
}
