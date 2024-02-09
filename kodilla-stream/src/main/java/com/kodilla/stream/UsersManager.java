package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
        List<String> userOlderThan = filterChemistGroupUserOlderThan(40);
        System.out.println( userOlderThan);
        List<String> userPostAndGroup = filterPOstAndGroup(0, "Chemists");
        System.out.println( userPostAndGroup);
    }

    static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UserRepository.getUsersList().stream().filter(user -> user.getGroup().equals("Chemists")).map(UsersManager::getUserName).collect(Collectors.toList());
        return usernames;
    }
    static List<String> filterChemistGroupUserOlderThan(int age) {
        List<String> userOlderThan = UserRepository.getUsersList().stream().filter(user -> user.getAge() > age).map(UsersManager::getUserName).collect(Collectors.toList());
        return userOlderThan;
    }
    static List<String> filterPOstAndGroup(int numberOfPost, String group) {
        List<String> userPostAndGroup = UserRepository.getUsersList().stream().filter(user -> user.getNumberOfPost() > numberOfPost).filter(user -> user.getGroup().equals(group)).map(UsersManager::getUserName).collect(Collectors.toList());
        return userPostAndGroup;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}
