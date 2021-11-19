@java.lang.Override
public void detachActor(com.ourpalm.hot.aactor.ActorRef ref) {
    config.getDispatcher().detachActor(ref);
}