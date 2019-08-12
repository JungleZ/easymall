package cn.tedu.config;

import cn.tedu.pojo.User;

public class UserTheadLocal {
    private static ThreadLocal<User> thread = new ThreadLocal<User>();

    public static void set(User user) {
        thread.set(user);
    }

    public static User get() {
        return thread.get();
    }

    public static void remove() {
        thread.remove();
    }
}
