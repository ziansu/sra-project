@java.lang.Override
public java.lang.String getNextUrl() {
    if ((cur) == 0) {
        cur = 1;
        return url[0];
    }
    return "";
}