package my.ch.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by chenh on 2017/7/18.
 */
public class RegisterEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public RegisterEvent(Object source) {
        super(source);
    }
}
