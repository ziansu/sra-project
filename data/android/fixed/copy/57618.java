public java.lang.Void call() throws java.lang.Exception {
    sendBack(name, invoke(org.flg.hiromi.pulsecontroller.PulseCommChannel.PUT, ("/trigger?name=" + name)), true);
    return null;
}