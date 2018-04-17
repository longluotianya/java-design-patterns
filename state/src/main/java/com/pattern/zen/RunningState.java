package com.pattern.zen;

/**
 * Created by gouzhijun
 * on 2018/4/17
 */
public class RunningState extends LiftState {

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯上下跑...");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState); //环境设置为停止状态；
        super.context.getLiftState().stop();
    }
}
