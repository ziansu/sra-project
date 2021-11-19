public boolean hasEnoughSpace(com.twiw.trackman.bean.Talk talk) {
    return ((this.usedSpace) == 0) || ((this.volume) >= ((this.usedSpace) + (talk.getValue())));
}