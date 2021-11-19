public static void main(java.lang.String[] args) {
    int message = 16;
    int encryptedMessage = Hash.hash(message);
    java.lang.System.out.println(encryptedMessage);
}