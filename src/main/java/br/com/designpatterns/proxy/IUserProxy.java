package br.com.designpatterns.proxy;

public interface IUserProxy {
    void save(User user);
    User findById(Long id);
}
