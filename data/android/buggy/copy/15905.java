@java.lang.Override
protected boolean parseMsg(java.lang.String body, net.anei.cadpage.parsers.MsgInfo.Data data) {
    body = body.replace(" Inc# ", " Inc: ");
    return parseFields(body.split(";"), data);
}