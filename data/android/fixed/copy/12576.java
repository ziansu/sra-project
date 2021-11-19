@java.lang.Override
public void call(java.lang.Object... args) {
    socket.emit("foo", "hi");
}