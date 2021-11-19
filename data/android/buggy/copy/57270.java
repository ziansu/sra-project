public static void main(java.lang.String[] args) {
    java.net.URL location = nosi.teste.MainTest.class.getProtectionDomain().getCodeSource().getLocation();
    java.lang.System.out.println(location.getFile());
}