@java.lang.Override
public void parse(java.lang.String field, net.anei.cadpage.parsers.MsgInfo.Data data) {
    java.util.regex.Matcher mat = net.anei.cadpage.parsers.OH.OHAuglaizeCountyParser.REDUNDANT_X.matcher(field);
    if (mat.matches())
        field = mat.group(1);
    
    super.parse(field, data);
}