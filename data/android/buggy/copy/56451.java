private void printBottomBorder(int theScreenWidth) {
    for (int i = 0; i < theScreenWidth; i++) {
        java.lang.System.out.print("_");
    }
    java.lang.System.out.println("\n");
    java.lang.System.out.print(Project.UserInterface.CURSOR);
}