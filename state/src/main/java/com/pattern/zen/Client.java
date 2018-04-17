package com.pattern.zen;

/**
 * Created by gouzhijun
 * on 2018/4/17
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
