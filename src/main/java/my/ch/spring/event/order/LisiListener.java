package my.ch.spring.event.order;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by chenh on 2017/7/31.
 */
@Component
public class LisiListener implements ApplicationListener<ApplicationEvent>{
    @Override
    public void onApplicationEvent(final ApplicationEvent event) {
        if(event instanceof ContentEvent) {
            System.out.println("李四收到了新的内容：" + event.getSource());
        }
    }
}
