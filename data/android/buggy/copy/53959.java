@java.lang.Override
public void onError(java.lang.Throwable throwable) {
    com.dkohut.bookchat.service.ChatService.observers.remove(responseObserver);
}