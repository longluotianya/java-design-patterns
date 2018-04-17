package com.pattern.zen;

/**
 * 电梯的状态
 * Created by gouzhijun
 * on 2018/4/17
 */
public abstract class LiftState {

    protected Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();
}
