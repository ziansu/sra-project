public void onClick(android.view.View v) {
    if (checkNumberOfTries()) {
        if (isCharInWord("å")) {
            android.util.Log.i("Button", "You guessed a right character");
        }else {
            btn_å.setEnabled(false);
        }
    }else {
        return ;
    }
}