package br.com.designpatterns.proxy;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User {
    private String name;
    private int age;
}
