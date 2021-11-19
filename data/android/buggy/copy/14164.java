@java.lang.Override
public boolean processReply() {
    if (!(super.processReply()))
        return false;
    
    java.lang.System.out.println(reply.get(KEY_CONTENT));
    return true;
}