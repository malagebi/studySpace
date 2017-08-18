package org.com.lsl.controller.user;

import org.com.lsl.controller.BaseController;
import org.com.lsl.entity.sysUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class LoginController extends BaseController {


    public String login(sysUser user, Model model) {

        model.addAttribute("");

        return "index";
    }
}
