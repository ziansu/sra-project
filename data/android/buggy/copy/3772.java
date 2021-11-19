@java.lang.Override
public void parse(java.lang.String field, net.anei.cadpage.parsers.MsgInfo.Data data) {
    if (!(checkParse(field, data)))
        abort();
    
}