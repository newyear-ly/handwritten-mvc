package pub.newyear.framework.business.service.impl;

import pub.newyear.framework.annotation.Service;
import pub.newyear.framework.business.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void getById(Long id) {
        System.out.println("用户的id为："+ id);
    }
}
