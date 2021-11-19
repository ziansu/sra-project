private int askUserIndex() {
    java.lang.String option;
    int index;
    java.lang.System.out.println("\nType the item number: ");
    option = inputGetter.nextLine();
    index = (java.lang.Integer.parseInt(option)) - 1;
    return index;
}