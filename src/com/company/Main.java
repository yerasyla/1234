package com.company;

class Director{
    private static Director instance;
    private String name;

    private Director(){}

    public static Director getInstance(){
        if (instance == null){
            instance = new Director();
        }
        return instance;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }


}




public class Main {

    public static void main(String[] args) {
	    Director dir1 = Director.getInstance();
        Director dir2 = Director.getInstance();
        dir1.setName("Famir");
        dir2.setName("Naoka");

        System.out.println(dir1.getName());
        System.out.println(dir2.getName());

    }
}
