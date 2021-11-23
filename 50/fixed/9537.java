private void analyzeLine(java.lang.String line) {
    com.gmail.chibitopoochan.soqlexec.ui.DialogProcessor.logger.debug(com.gmail.chibitopoochan.soqlexec.ui.DialogProcessor.resources.getString(Constants.Message.Information.MSG_011), line);
    if (!(inQuery))
        analyzeCommand(line);
    
    if (inQuery)
        analyzeQuery(line);
    
}