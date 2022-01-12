public void fixFile() {
    java.lang.String filecontent = this.getContentofFile();
    filecontent = filecontent.replaceAll(";\n\n---", ";\n---");
    this.rewriteFile(filecontent);
}