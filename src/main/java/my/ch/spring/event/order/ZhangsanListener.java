package my.ch.spring.event.order;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by chenh on 2017/7/31.
 */
@Component
public class ZhangsanListener implements ApplicationListener<ContentEvent> {
    @Override
    public void onApplicationEvent(final ContentEvent event) {
        System.out.println("张三收到了新的内容：" + event.getSource());
    }
}
