package my.ch.design_pattern.observer.pull.newspaper;

import my.ch.design_pattern.observer.pull.Observer;
import my.ch.design_pattern.observer.pull.Subject;

/**
 * 真正的读者，为了简单就描述于一下姓名
 * Created by chenh on 2017/7/19.
 */
public class Reader implements Observer {
    /**
     * 读者的姓名
     */
    private String name;

    public void update(Subject subject) {
        //这是采用拉的方式
        System.out.println(name + "收到报纸了，阅读它。内容是===" + ((NewsPaper) subject).getContent());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
