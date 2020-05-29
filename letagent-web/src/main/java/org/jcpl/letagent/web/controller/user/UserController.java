package org.jcpl.letagent.web.controller.user;

import org.jcpl.letagent.view.JcJsonView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户相关信息
 */
@RequestMapping("/user")
public class UserController {


    /**
     * 根据用户名取得用户的信息
     * @param username
     * @return
     */
    @GetMapping("/getUserByName")
    public JcJsonView getUser(String username) {

    }
}
