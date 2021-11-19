@java.lang.Override
public java.net.PasswordAuthentication getPasswordAuthentication() {
    java.lang.System.out.println("Ok");
    return new java.net.PasswordAuthentication(userName, password.toCharArray());
}