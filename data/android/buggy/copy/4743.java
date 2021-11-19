@java.lang.Override
protected void interrupted() {
    try {
        this.out.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}