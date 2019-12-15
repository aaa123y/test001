package cn.it.controller;

import cn.it.jopo.User;

/**
 * @author NICK
 * @version 2019/12/15.
 */
public class UserController {
    public static void main(String[] args) {
        User u=new User(2,"李白","123456","男");
        System.out.println(u);
    }
}
