private void onOK() {
    if (((arcFilePath) == null) || ((nodeFilePath) == null))
        dispose();
    
    resultActionListener.actionPerformed(null);
    dispose();
}