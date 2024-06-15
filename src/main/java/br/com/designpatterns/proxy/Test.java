package br.com.designpatterns.proxy;

public class Test {
    public static void main(String[] args) {
        UserRepositoryProxy userRepositoryProxy = new UserRepositoryProxy();
        UserService userService = new UserService(userRepositoryProxy);

        var user = new User.UserBuilder().name("John Doe").age(35).build();

        userService.save(user);
        var createdUser = userService.findById(1L);
        System.out.println(createdUser);

        var cachedUser = userService.findById(1L);
        System.out.println(cachedUser);
    }
}
