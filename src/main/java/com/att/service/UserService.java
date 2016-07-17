package com.att.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;
import com.att.model.User;

@Service("userService")
public class UserService {
    private final Map<String, User> userStore = new HashMap();

    public List<User> allUsers() {
        return new ArrayList(userStore.values());
    }

    public User addUser(User user) {
        return userStore.put(user.getId(), user);
    }

    public void deleteUser(String id) {
        userStore.remove(id);
    }
    
    public User findUser(String id){
        return userStore.get(id);
    }
}
