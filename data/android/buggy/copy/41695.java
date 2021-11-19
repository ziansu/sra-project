public void flushWriter() {
    output.println(message);
    output.flush();
    java.lang.System.out.println(message.length());
    message = new java.lang.StringBuilder();
}