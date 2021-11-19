public java.lang.String getCodeDescription(java.lang.String code) {
    net.anei.cadpage.parsers.CodeTable.Result res = getResult(code);
    if (res == null)
        return null;
    
    return res.getDescription();
}