package my.ch.design_pattern.observer.observer_diff_action;

/**
 * Created by chenh on 2017/7/19.
 */
public class Watcher implements WatcherObserver{
    /**
     * 职务
     */
    private String job;

    @Override
    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String getJob() {
        return this.job;
    }

    public void update(WaterQualitySubject subject){
        //这里采用的是拉的方式
        System.out.println(job+"获取到通知，当前污染级别为："+subject.getPolluteLevel());
    }
}
