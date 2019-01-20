package com.lychao163.programme.innerclass;

public class Outer2 {
    private static int shared = 100;
    private void action() {
        System.out.println("这是外部类的action方法");
    }
    public void test( String param){
         String str="hello";
        class Inner{
            public void innerMethod(){
                System.out.println("外部类的成员变量："+shared);
                System.out.println("方法的参数："+param);
                System.out.println("方法内的局部变量："+str);
                Outer2.this.action();
            }
        }
        Inner inner=new Inner();
        inner.innerMethod();
    }
    public static void main(String[] args) {
        Outer2 outer=new Outer2();
        outer.test("world");

    }
}
