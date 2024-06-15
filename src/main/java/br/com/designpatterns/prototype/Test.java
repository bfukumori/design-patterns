package br.com.designpatterns.prototype;

public class Test {

    public static void main(String[] args) {
        var redButton = ButtonRegistry.getButton("RED BUTTON");
        var blueButton = ButtonRegistry.getButton("BLUE BUTTON");

        System.out.println(redButton);
        System.out.println(blueButton);
    }
}
