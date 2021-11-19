public java.lang.String executeRequest(java.lang.String command) {
    if (command.startsWith("LOGIN")) {
        if (checkLoginMessage(command)) {
            return "SUCCESSUSER";
        }else {
            return "FAILURE";
        }
    }
    return "INVALID";
}