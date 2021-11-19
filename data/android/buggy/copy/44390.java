public void resetChannelMax(int givenMax) {
    maxChannel = givenMax - 1;
    if ((maxChannel) < (currentChannel)) {
        currentChannel = maxChannel;
    }
    if ((previousChannel) > (maxChannel)) {
        previousChannel = maxChannel;
    }
}