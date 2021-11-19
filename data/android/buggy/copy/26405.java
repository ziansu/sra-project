public void processInput(java.lang.String s) {
    if (s == "")
        return ;
    
    if ((s.charAt(0)) == 'X') {
        play = false;
        return ;
    }
    output(getBotResponse(s));
}