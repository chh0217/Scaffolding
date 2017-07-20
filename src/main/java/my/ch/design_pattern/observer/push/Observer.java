package my.ch.design_pattern.observer.push;

/**
 * 观察者，比如报纸的读者
 * Created by chenh on 2017/7/19.
 */
public interface Observer {
    /**
     * 被通知的方法，直接把报纸的内容推送过来
     *
     * @param content
     */
    public void update(String content);
}
