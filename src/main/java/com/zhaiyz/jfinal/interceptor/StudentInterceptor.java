package com.zhaiyz.jfinal.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * Created by zhaiyz on 15-12-13.
 */
public class StudentInterceptor implements Interceptor {

    public void intercept(Invocation inv) {
        System.out.println("Before action invoking");
        inv.invoke();
        System.out.println("After action invoking");
    }
}
