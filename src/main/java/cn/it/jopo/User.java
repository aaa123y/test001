package cn.it.jopo;

import lombok.AllArgsConstructor;
import lombok.Data;


/**
 * @author NICK
 * @version 2019/12/15.
 */
@Data
@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
    private String sex;
}
