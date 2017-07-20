package my.ch.design_pattern.observer.observer_diff_action;

/**
 * Created by chenh on 2017/7/19.
 */
public class WaterQuality extends WaterQualitySubject {

    /**
     * 污染的级别，0表示正常，1表示轻度污染，2表示中毒污染，3表示高度污染
     */
    private int polluteLevel = 0;

    @Override
    public void notifyWatchers() {
        for(WatcherObserver watcher:observers){
            //开始根据污染级别判断是否需要通知，由这里总控
            if(this.polluteLevel >= 0){
                //通知检测员做记录
                if("监测人员".equals(watcher.getJob())){
                    watcher.update(this);
                }
            }
            if(this.polluteLevel >= 1){
                //通知预警人员
                if("预警人员".equals(watcher.getJob())){
                    watcher.update(this);
                }
            }
            if(this.polluteLevel >= 2){
                //通知检测部门领导
                if("监测部门领导".equals(watcher.getJob())){
                    watcher.update(this);
                }
            }
        }
    }

    /**
     * 获取水质污染的级别
     *
     * @return
     */
    @Override
    public int getPolluteLevel() {
        return polluteLevel;
    }

    /**
     * 当检测水质情况后，设置水质污染的级别
     *
     * @param polluteLevel
     */
    public void setPolluteLevel(int polluteLevel) {
        this.polluteLevel = polluteLevel;
        //通知响应的观察者
        this.notifyWatchers();
    }
}
