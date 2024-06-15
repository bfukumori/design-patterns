package br.com.designpatterns.proxy;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private final Map<Long,User> usersDB = new HashMap<>();

    private static Long countId = 1L;

    public void save(User user) {
        usersDB.put(countId++, user);
    }

    public User findById(Long id) {
      try {
          Thread.sleep(3000);
          return usersDB.get(id);
      } catch (InterruptedException e) {
          throw new RuntimeException(e);
      }
    }
}
