package br.com.designpatterns.proxy;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class UserRepositoryProxy extends UserRepository implements  IUserProxy{

    private static final Logger log = Logger.getLogger(UserRepositoryProxy.class.getName());

    private final Map<Long, User> usersCachedDB = new HashMap<>();

    @Override
    public void save(User user) {
        log.info("Saving user: " + user);
        super.save(user);
        log.info("Saved user: " + user);
    }

    @Override
    public User findById(Long id) {

        User user;

        log.info("Starting findById...");
        var startTime = System.currentTimeMillis();

        if (usersCachedDB.containsKey(id)) {
            log.info("Getting from cache...");
            user = usersCachedDB.get(id);
        }
        else {
            log.info("Getting from repository...");
            user = super.findById(id);
            usersCachedDB.put(id, user);
        }
        log.info("Finished findById.");
        var endTime = System.currentTimeMillis();
        log.info("Time spent: " + (endTime - startTime));
        return user;
    }
}