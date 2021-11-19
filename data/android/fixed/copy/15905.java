@java.lang.Override
protected boolean parseMsg(java.lang.String body, net.anei.cadpage.parsers.MsgInfo.Data data) {
    return parseFields(body.split(";"), data);
}