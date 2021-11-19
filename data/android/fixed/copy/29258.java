public void handle(java.lang.String msg) {
    if (msg.contains(".bye")) {
        townofwinchester.ChatClient.logger.info("Good bye. Press RETURN to exit...");
        stop();
    }else
        java.lang.System.out.println(msg);
    
}