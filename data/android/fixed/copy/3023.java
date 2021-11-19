public void speak(java.lang.String text) {
    if ((text != null) && (!(text.isEmpty())))
        new java.lang.Thread(() -> speakBlocking(text)).start();
    
}