package com.niit;

public class DemoInput {
    public void plus(int num) {
        num += 1; //11
    }

    public void plusRef(Human human) {
        human.setName("Linh");
    }

    public static void main(String[] args) {
        int a = 10;
        DemoInput demoInput = new DemoInput();
        demoInput.plus(a);
        System.out.println(a);//10 //truyền tham trị

        Human luan = new Human();
        luan.setName("Luan");
        demoInput.plusRef(luan);
        System.out.println(luan.getName());//Linh //truyền tham chiếu
    }
}
