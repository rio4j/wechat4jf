package com.zhaiyz.jfinal.main;

import com.jfinal.core.JFinal;

/**
 * Created by zhaiyz on 15-12-13.
 */
public class Main {

    public static void main(String[] args) {
        JFinal.start("src/main/webapp", 8080, "/", 5);
    }
}
