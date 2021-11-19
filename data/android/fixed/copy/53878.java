@java.lang.Override
public void run(java.lang.String privateGameCode) {
    org.greenrobot.eventbus.EventBus.getDefault().post(new com.offsidegame.offside.events.PrivateGameGeneratedEvent(privateGameCode));
}