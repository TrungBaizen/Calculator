package com.example.calculator.model;

public class CalculatorModel {
    private int numberOne;
    private int numberTwo;
    private String add;
    private String sub;
    private String mul;
    private String div;

    public CalculatorModel() {
    }

    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getMul() {
        return mul;
    }

    public void setMul(String mul) {
        this.mul = mul;
    }

    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }
}
