private void onOK() {
    if (((arcFilePath) == null) || ((nodeFilePath) == null)) {
        dispose();
        return ;
    }
    resultActionListener.actionPerformed(null);
    dispose();
}