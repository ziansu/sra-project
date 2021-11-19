public void onSuccess(java.lang.String result) {
    play.Logger.error(("-> SOCKET: " + (result.toString())));
    socket.tell(((java.lang.Object) (result)), getSelf());
}