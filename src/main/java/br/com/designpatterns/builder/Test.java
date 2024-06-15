package br.com.designpatterns.builder;

public class Test {
    public static void main(String[] args) {
        var person = new Person.PersonBuilder().name("John Doe").age(35).build();
        System.out.println("Person with builder: "+ person);

        var person2 = new PersonWithLombok("Goku",34);
        System.out.println("Person with lombok: "+ person2);

        var person3 = new PersonWithLombok.PersonWithLombokBuilder().name("Vegeta").age(25).build();
        System.out.println("Person with lombok builder: "+ person3);
    }
}
