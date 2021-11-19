@java.lang.Override
public void handleClick(int position) {
    eventBus.post(new me.gumenniy.arkadiy.vkmusic.presenter.event.PlayQueueEvent(data, position));
}