package com.yhntest.reflectasm;

import com.esotericsoftware.reflectasm.MethodAccess;

import java.lang.reflect.Method;

/**
 * Created by mjk on 2018/4/22.
 */
public class ReflectASM {

    public static void main(String[] args) {
        User user = new User();
        System.out.println();
    }

    public static void testJdkReflect() throws Exception {
        User user = new User();
        for (int i = 0; i < 5; i++) {
            long begin = System.currentTimeMillis();
            for (int j = 0; j < 100000000; j++) {
                Method method = User.class.getMethod("foo", String.class);
                method.invoke(user, "Unmi");
            }
            System.out.print(System.currentTimeMillis() - begin + " ");
        }
    }

    public static void testReflectAsm() {
        User user = new User();
        for (int i = 0; i < 5; i++) {
            long begin = System.currentTimeMillis();
            for (int j = 0; j < 100000000; j++) {
                MethodAccess access = MethodAccess.get(User.class);
                access.invoke(user, "foo", "Unmi");

            }
            System.out.print(System.currentTimeMillis() - begin + " ");
        }
    }

}
