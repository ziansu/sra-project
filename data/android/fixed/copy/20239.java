@java.lang.Override
public java.lang.String run() {
    return context.getCookieProcessor().generateHeader(cookie);
}