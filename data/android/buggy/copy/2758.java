private static java.lang.String dummyUI(java.lang.String msg) {
    java.lang.System.out.println(msg);
    java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
    java.lang.String commandFromUser = sc.nextLine();
    sc.close();
    return commandFromUser;
}