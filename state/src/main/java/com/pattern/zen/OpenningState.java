package com.pattern.zen;

/**
 * Created by gouzhijun
 * on 2018/4/17
 */
public class OpenningState extends LiftState {

    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }

    @Override
    public void close() {
        //状态修改
        super.context.setLiftState(Context.openningState);
        //动作委托为CloseState来执行
        super.context.getLiftState().close();
    }

    @Override
    public void run() {
    }

    @Override
    public void stop() {
    }
}
