package br.com.designpatterns.prototype;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public enum ButtonRegistry {
    INSTANCE;

    private static final Map<String,Button> REGISTRY = new HashMap<>();

    static {
        var redButton = new Button.ButtonBuilder().color("red").label("Cancel").width(200).height(100).build();
        REGISTRY.put("RED BUTTON", redButton);
        var blueButton = new Button.ButtonBuilder().color("blue").label("Confirm").width(200).height(100).build();
        REGISTRY.put("BLUE BUTTON", blueButton);
    }

    public static ButtonRegistry getInstance() {
        return INSTANCE;
    }

    public static Button getButton(String key) {
        return ButtonFactory.getInstance(REGISTRY.get(key));
    }
}
