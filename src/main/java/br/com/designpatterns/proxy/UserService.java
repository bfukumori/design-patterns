package br.com.designpatterns.proxy;

public class UserService {
    private final IUserProxy userRepository;

    public UserService(IUserProxy userRepository) {
        this.userRepository = userRepository;
    }

    public void save(User user) {
        userRepository.save(user);
    }

    public User findById(Long id) {
        return userRepository.findById(id);
    }
}
