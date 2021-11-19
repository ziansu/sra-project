public boolean isAllAcked() {
    return ((this.lastMessageAcked) > (-1)) && (((this.messagesSent) - 1) == (this.lastMessageAcked));
}