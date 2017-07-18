package my.ch.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by chenh on 2017/7/18.
 */
@Component
public class PointRegisterListener implements ApplicationListener<RegisterEvent> {
    @Override
    public void onApplicationEvent(RegisterEvent event) {
        System.out.println("注册成功-----增加积分");
    }
}
