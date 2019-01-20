package com.lychao163.programme.innerclass;

public class Outer1 {
    private static int shared = 100;
    private void action() {
        System.out.println("这是外部类的action方法");
    }
    public class Inner {
        public void innerMethod() {
            System.out.println("inner：" + shared);
            Outer1.this.action();
        }
    }
    public static void main(String[] args) {
        Outer1 outer=new Outer1();
        Outer1.Inner inner =outer.new Inner();
        inner.innerMethod();
    }
}
