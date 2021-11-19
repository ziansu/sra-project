public static com.seveniu.thriftServer.Proxy findByValue(int value) {
    switch (value) {
        case 1 :
            return com.seveniu.thriftServer.Proxy.ON;
        case 2 :
            return com.seveniu.thriftServer.Proxy.OFF;
        default :
            return null;
    }
}