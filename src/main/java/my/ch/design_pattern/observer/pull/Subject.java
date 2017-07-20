package my.ch.design_pattern.observer.pull;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，它知道观察它的观察者，并提供注册和删除观察者的接口
 * Created by chenh on 2017/7/19.
 */
public class Subject {
    /**
     * 用来保存注册的观察者对象,也就是报纸的订阅者
     */
    private List<Observer> observers = new ArrayList<>();

    /**
     * 注册观察者对象
     * @param observer 观察者对象
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 删除观察者对象
     * @param observer 观察者对象
     */
    public  void detach(Observer observer){
        observers.remove(observer);
    }

    /**
     * 控制所有注册的观察者对象
     */
    protected void notifyObservers(){
        for(Observer observer:observers){
            observer.update(this);
        }
    }
}
