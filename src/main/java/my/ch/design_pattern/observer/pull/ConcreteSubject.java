package my.ch.design_pattern.observer.pull;

/**
 * Created by chenh on 2017/7/19.
 */
public class ConcreteSubject extends Subject{
    /**
     * 示意，目标对象的状态
     */
    private String subjectState;
    public String getSubjectState(){
        return subjectState;
    }
    public void setSubjectState(String subjectState){
        this.subjectState = subjectState;
        //状态发生了改变，通知各个观察者
        this.notifyObservers();
    }
}
