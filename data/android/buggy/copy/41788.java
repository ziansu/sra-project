public java.lang.String getCommand() {
    java.lang.System.out.print(("Digite o proximo comando: " + "\n"));
    return new java.util.Scanner(java.lang.System.in).next().toLowerCase();
}