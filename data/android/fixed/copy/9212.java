@java.lang.Override
public void handle(java.util.Map data) {
    dbf.remove(self);
    returnVip();
    completion.success();
}