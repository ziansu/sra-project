public void getDataForUser() {
    this.mSocket.emit("getTodo", 1);
    this.mSocket.emit("getApp", 1);
}