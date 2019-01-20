package com.lychao163.programme.innerclass;

public class Child extends Father {
    private Skill skill;
    public Child(){
        skill=new Child.Skill();
    }
    @Override
    public void runSkill() {
        System.out.println("孩子继承了父亲的优点，擅长跑步");
    }
    private class Skill extends Mother{
        @Override
        public void songSkill() {
            System.out.println("孩子继承了母亲的优点，擅长唱歌");
        }
    }
    public static void main(String[] args) {
        Child child=new Child();
        child.runSkill();
        child.skill.songSkill();
    }
}
