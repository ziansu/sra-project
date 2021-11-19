public java.util.List<com.exmertec.yaz.model.User> queryList() {
    return with(field(userName).like(userName.substring(1))).queryList();
}