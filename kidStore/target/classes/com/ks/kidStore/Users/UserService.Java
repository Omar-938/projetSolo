
package com.ks.kidStore.Users;

import java.util.List;

@Service
public class UserService {
    
    private UserRepository userRepository;
    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }
    
    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }
    
    public void addUser(User user) {
        userRepository.addUser(user);
    }
    
    public void updateUser(User user) {
        userRepository.updateUser(user);
    }
    
    public void deleteUser(int id) {
        userRepository.deleteUser(id);
    }
}
