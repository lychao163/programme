package com.lychao163.programme.innerclass;

public class Outer {
    private static  int shared=100;
    public static class StaticInner {
        public void innerMethod(){
            System.out.println("inner："+shared);
        }
    }
    public static void main(String[] args) {
        StaticInner staticInner=new StaticInner();
        staticInner.innerMethod();
    }
}
