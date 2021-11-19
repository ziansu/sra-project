public static java.lang.String getUserChoice() {
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.String output = scanner.nextLine();
    scanner.close();
    return output;
}