package my.ch.design_pattern.observer.observer_diff_action;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenh on 2017/7/19.
 */
public abstract class WaterQualitySubject {
    /**
     * 用来保存注册的观察者对象
     */
    protected List<WatcherObserver> observers = new ArrayList<>();

    /**
     * 注册观察者对象
     * @param observer 观察者对象
     */
    public void attach(WatcherObserver observer){
        observers.add(observer);
    }

    /**
     * 通知相应的观察者对象
     */
    public abstract void notifyWatchers();

    /**
     * 获取水质污染的级别
     * @return  水质污染的级别
     */
    public abstract int getPolluteLevel();
}
