package com.lion.demo.demo01;

class XiYouJiRenWu{
    float height;
    float weight;
    String head,ear;
    void speak(String s){
        System.out.println(s);
    }
}

public class Demo01 {
    public static void main(String[] args) {
        XiYouJiRenWu zhubajie = new XiYouJiRenWu();
        zhubajie.speak("houge");
    }
}
