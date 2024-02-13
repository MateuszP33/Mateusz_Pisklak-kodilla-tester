package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;
import com.kodilla.stream.UsersManager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForumStats {
    public static void main(String[] args) {
        System.out.println(averageNumberOfPostsOver40(UserRepository.getUsersList()));
        System.out.println(averageNumberOfPostsUnder40(UserRepository.getUsersList()));

    }

    public static double averageNumberOfPostsOver40(List<User> users) {
        double numberOfPostsOver40 = users.stream().filter(user -> user.getAge() >= 40)
                .mapToDouble(User::getNumberOfPost).average().orElse(0.0);
        return numberOfPostsOver40;
    }

    public static double averageNumberOfPostsUnder40(List<User> users) {
        double numberOfPostsUnder40 = users.stream().filter(user -> user.getAge() < 40)
                .mapToDouble(User::getNumberOfPost).average().orElse(0.0);
        return numberOfPostsUnder40;
    }
}
