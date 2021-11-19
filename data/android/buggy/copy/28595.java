public java.lang.Object call() throws java.lang.Exception {
    try {
        persistOnly(o, id);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        java.lang.System.out.println("CAUGHT AND RETHROWING");
        throw e;
    }
    return o;
}