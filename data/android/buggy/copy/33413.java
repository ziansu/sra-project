public static void main(java.lang.String[] args) {
    Parser.CommandController test = new Parser.CommandController();
    test.initialiseTasks();
    java.lang.System.out.println(test.executeCommand("-add recur -date 23/03/2015 -recurring 2 monthly"));
    java.lang.System.out.println(test.returnTasks());
}