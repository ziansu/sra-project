public static void display(java.lang.String className, java.lang.String errorMessage) {
    byui.cit260.theifGame.view.ErrorView.errorFile.println(((("------------------------------------------------" + "\n- ERROR - ") + errorMessage) + "\n------------------------------------------------"));
    byui.cit260.theifGame.view.ErrorView.logFile.println(((className + " - ") + errorMessage));
}