private java.lang.String processRequest(java.io.ObjectInputStream request) {
    if (com.javaOOPProject.server.XMLManager.isRegistered(request)) {
        return "trueee";
    }
    return "hi";
}