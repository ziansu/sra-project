@java.lang.Override
public void setDateHeader(java.lang.String name, long date) {
    this.response.setHeader(name, utils.FastHttpDateFormat.formatDate(date, FastHttpDateFormat.format));
}