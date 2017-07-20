package my.ch.design_pattern.observer.jdkApi;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by chenh on 2017/7/19.
 */
public class Reader implements Observer {
    /**
     * 读者的姓名
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * java实现观察者模式默认实现拉模型
     * 如果是采用推的方式，则两种方式都可以获取到值
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        //这是采用推得方式
        System.out.println(name + "收到报纸了，阅读它。目标推过来的内容是===" + arg);

        //这是获取拉的数据
        System.out.println(name + "收到报纸了，阅读它。主动到目标对象去拉的内容是===" + ((NewsPaper) o).getContent());
    }
}
