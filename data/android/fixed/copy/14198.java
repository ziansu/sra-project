public void run() {
    while ((movieTime) > 0) {
        java.lang.String message = ((movieName) + "/Time left: ") + (movieTime);
        new CountdownDisplay().handleTime(message);
    } 
}