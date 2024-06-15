package br.com.designpatterns.prototype;

public class ButtonFactory {

    public static Button getInstance(Button prototype) {
        return new Button.ButtonBuilder().color(prototype.color).label(prototype.label).width(prototype.width).height(prototype.height).build();
    }
}
