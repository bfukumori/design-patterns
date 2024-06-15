package br.com.designpatterns.prototype;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Button {
    protected String label;
    protected String color;
    protected int height;
    protected int width;
}
