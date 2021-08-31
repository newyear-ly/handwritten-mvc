package pub.newyear.framework.business;

import pub.newyear.framework.annotation.Autowired;
import pub.newyear.framework.annotation.Controller;
import pub.newyear.framework.business.service.UserService;

@Controller
public class UserController {

    @Autowired
    public UserService userService;

    public void getById(Long id){
        userService.getById(id);
    }
}
