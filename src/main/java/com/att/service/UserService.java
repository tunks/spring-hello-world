package com.att.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.att.model.User;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Service("userService")
public class UserService {
    private final ConcurrentMap<String, User> userStore = new ConcurrentHashMap();

    public List<User> allUsers() {
        return new ArrayList(userStore.values());
    }

    public User addUser(User user) {
           String id = user.getId();
           userStore.put(id, user);
           return userStore.get(id);
    }

    public void deleteUser(String id) {
        userStore.remove(id);
    }
    
    public User findUser(String id){
        return userStore.get(id);
    }
}
