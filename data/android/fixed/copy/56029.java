@java.lang.Override
public void onEventReceived(java.lang.Object event) {
    if (event instanceof com.github.stakkato95.sprint3.event.ChromeFavouriteEvent) {
        handleChromeFavouriteEvent(((com.github.stakkato95.sprint3.event.ChromeFavouriteEvent) (event)));
    }
}