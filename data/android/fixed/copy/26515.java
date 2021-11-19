public void setData(java.lang.String data) {
    this.dataL = helper.Packet.dataToByteArray(data).length;
    this.data = data;
}