package my.ch.design_pattern.observer.pull;

/**
 * 具体观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
 * Created by chenh on 2017/7/19.
 */
public class ConcreteObserver implements Observer{
    /**
     * 示意，观察者的状态
     */
    private String observerState;

    public void update(Subject subject){
        //具体的更新实现
        //这里可能需要更新观察者的状态
        observerState = ((ConcreteSubject)subject).getSubjectState();
    }
}
