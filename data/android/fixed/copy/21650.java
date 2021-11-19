public void onClick(android.view.View v) {
    if (checkNumberOfTries()) {
        isCharInWord("å");
        btn_å.setEnabled(false);
    }else {
        return ;
    }
}