public java.lang.String readString() {
    if (isActive()) {
        return client.readStringUntil(BlackJackDemo.EOL);
    }
    return null;
}