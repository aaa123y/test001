package cn.it.controller;

import cn.it.jopo.User;

/**
 * @author NICK
 * @version 2019/12/15.
 */
public class UserController {
    public static void main(String[] args) {
        User u=new User(1,"李白","12345","男");
        System.out.println(u);
    }
}
