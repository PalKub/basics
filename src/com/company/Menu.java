package com.company;

public class Menu {
    private int number;
    private String text;
    private int varInt;
    private Integer varInteger;
    private Brand car = Brand.POLONEZ;
    private double number1;
    private double number2;
    private String textA = "text";
    private String textB = "text";

    public Menu(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public Menu() {

    }

    public String format(){
        return "*" + number + "-" + text + "*";
    }

    public void klasa(){
        System.out.println(text.getClass());
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }

    public int getVarInt() {
        return varInt;
    }

    public Integer getVarInteger() {
        return varInteger;
    }

    public void setCar(Brand car) {
        this.car = car;
    }

    public Brand getCar() {
        return car;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public String getTextA() {
        return textA;
    }

    public String getTextB() {
        return textB;
    }
}
