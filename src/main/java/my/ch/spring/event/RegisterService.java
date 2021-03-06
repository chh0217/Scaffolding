package my.ch.spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by chenh on 2017/7/18.
 */
@Service
public class RegisterService {
    @Autowired
    private ApplicationContext applicationContext;

    public void register(String username, String password) {
        System.out.println(username + "注册成功！");
        publishRegisterEvent(new User(username, password));
    }

    private void publishRegisterEvent(User user) {
        applicationContext.publishEvent(new RegisterEvent(user));
    }
}
