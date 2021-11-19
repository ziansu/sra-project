public void setNew(java.lang.String token) {
    this.txtToken.setText(token);
    this.txtInfo.setText(messages.getString("tokenInfo"));
    this.lblGif.setIcon(gifServer);
}