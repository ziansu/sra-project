@java.lang.Override
public void onEventReceived(java.lang.Object event) {
    super.onEventReceived(event);
    if (event instanceof com.github.stakkato95.sprint3.event.PagerSlidedEvent) {
        handlePagerSlidedEvent(((com.github.stakkato95.sprint3.event.PagerSlidedEvent) (event)));
    }
}