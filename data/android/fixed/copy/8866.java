public java.lang.String listen() throws java.io.IOException {
    while (true) {
        java.lang.String message = in.readLine();
        if ((message != null) && (message.startsWith("MOVE")))
            return message;
        
    } 
}