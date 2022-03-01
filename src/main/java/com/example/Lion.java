package com.example;

import java.util.List;

public class Lion extends Animal implements IFeline{
    IFeline feline;
    String sex;
    boolean hasMane;

    public Lion(String sex, IFeline feline) throws Exception {
        this.feline = feline;
        this.sex = sex;

        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

     @Override
    public int getKittens() {
        return feline.getKittens();
    }

    @Override
    public int getKittens(int kittensCount) {
        return 0;
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return getFood("Хищник");
    }


}














