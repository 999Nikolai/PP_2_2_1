package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    public User getUserCar(String mmodel, int sseries);
    List<User> listUsers();
}
