package my.ch.design_pattern.observer.observer_diff_action;

/**
 * Created by chenh on 2017/7/19.
 */
public interface WatcherObserver {
    /**
     * 被通知的方法
     * @param subject 传入被观察的目标对象
     */
    public void update(WaterQualitySubject subject);

    /**
     * 设置观察人员的职务
     * @param job
     */
    public void setJob(String job);

    /**
     * 获取观察人员的职务
     * @return 观察人员的职务
     */
    public String getJob();
}
