@java.lang.Override
protected boolean parseMsg(java.lang.String body, net.anei.cadpage.parsers.MsgInfo.Data data) {
    body = stripFieldStart(body, "Talladega_County_9-1-1:");
    return parseFields(body.split(";"), data);
}