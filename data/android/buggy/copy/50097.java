public boolean isAllAcked() {
    return ((this.messagesSent) - 1) == (this.lastMessageAcked);
}