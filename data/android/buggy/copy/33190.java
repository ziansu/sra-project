public void printItems() {
    if ((GetItems().length) > 0) {
        java.lang.System.out.println("Current items:");
        for (java.lang.String s : GetItems()) {
            java.lang.System.out.print((s + " "));
        }
    }
}