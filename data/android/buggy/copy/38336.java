public static void main(java.lang.String[] args) {
    java.lang.System.out.println("Application, started");
    new java.lang.Thread(new core.Engine(java.lang.Boolean.parseBoolean(args[0]), java.lang.Boolean.parseBoolean(args[1]))).start();
}