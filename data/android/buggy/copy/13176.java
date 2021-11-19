public static void display(java.lang.String className, java.lang.String errorMsg) {
    byui.cit260.jurassicpark.view.ErrorView.errorFile.println(((("---------------------------" + "\nERROR: ") + errorMsg) + "\n---------------------------"));
    byui.cit260.jurassicpark.view.ErrorView.logFile.println(((className + " - ") + errorMsg));
}