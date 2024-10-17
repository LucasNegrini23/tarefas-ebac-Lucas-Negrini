package br.com.lnegrini.reflection;

import jdk.dynalink.NoSuchDynamicMethodException;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionsTest01 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException {


        System.out.println("*----CLASS---*");
        Class clazz = TabelaTest01.class;
        System.out.println(clazz);

        System.out.println("*----CONSTRUCTOR---*");
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
        }

        System.out.println("*---FIELD----*");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
            System.out.println(field.getType());
        }

        System.out.println("*---METHOD----*");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            Class<?> returnType = method.getReturnType();
            String nome = String.valueOf(method.getReturnType());
            System.out.println(method.getName());
            System.out.println(method.getReturnType());
        }
    }
}
