package my.ch.design_pattern.observer.push;

/**
 * Created by chenh on 2017/7/19.
 */
public class NewsPaper extends Subject{
    private String content;
    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content = content;
        //内容有了，说明又出报纸了，那就通知所有的读者
        notifyObservers(content);
    }
}
