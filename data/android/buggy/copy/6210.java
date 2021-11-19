public void fixFile() {
    java.lang.String filecontent = this.getContentofFile();
    filecontent = filecontent.replaceAll(";\n\n---", ";\n---");
    filecontent = filecontent.replaceAll("---;", "---;\n");
    this.rewriteFile(filecontent);
}