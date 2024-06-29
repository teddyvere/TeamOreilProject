package com.zipcodewilmington.scientificcalculator;

public class Features {
    public void setOperator(String operator) {this.operator = operator;}
    public Features() {

    }
    public int theAnswer(){
        if(operator.equals("*")){
            answer =value1 * value2;
        } else if(operator.equals("/")){
            answer = value1 / value2;
        } else if(operator.equals("+")){
            answer = value1 + value2;
        } else if(operator.equals("-")){
            answer = value1 - value2;

        }
        return answer;
    }
}
