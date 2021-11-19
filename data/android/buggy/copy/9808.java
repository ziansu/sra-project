public void goOnline() {
    try {
        status.goOnline();
    } catch (rUBERn.Exceptions.AlreadyInStatusException e) {
        e.printStackTrace();
    }
}