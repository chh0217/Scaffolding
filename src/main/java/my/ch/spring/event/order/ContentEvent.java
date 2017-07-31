package my.ch.spring.event.order;

import org.springframework.context.ApplicationEvent;

/**
 * Created by chenh on 2017/7/31.
 */
public class ContentEvent extends ApplicationEvent {
    public ContentEvent(final String content) {
        super(content);
    }
}
