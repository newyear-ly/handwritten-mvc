package pub.newyear;

import pub.newyear.framework.HelperLoader;
import pub.newyear.framework.business.UserController;
import pub.newyear.framework.helper.BeanHelper;
import pub.newyear.framework.helper.ClassHelper;

import java.util.Set;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        HelperLoader.init();
        Set<Class<?>> beanClass = ClassHelper.getBeanClassSet();
        System.out.println(beanClass);
        Set<Class<?>> classSet = ClassHelper.getClassSet();
        for (Class<?> aClass : classSet) {
            System.out.println(aClass);
        }
        UserController bean1 = BeanHelper.getBean(UserController.class);
        System.out.println(bean1);
        System.out.println(bean1.userService);
    }
}
