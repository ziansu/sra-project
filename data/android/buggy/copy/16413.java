public void copyToClipboard(java.lang.String data) {
    java.lang.String myString = data;
    java.awt.datatransfer.StringSelection stringSelection = new java.awt.datatransfer.StringSelection(myString);
    java.awt.datatransfer.Clipboard clpbrd = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
    clpbrd.setContents(stringSelection, null);
}