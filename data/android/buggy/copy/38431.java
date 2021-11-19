public void invalidate() {
    script.log("Invalidating Global path...");
    try {
        throw new java.lang.Exception("test");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    valid = false;
}