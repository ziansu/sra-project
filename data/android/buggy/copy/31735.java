public static final void NPE(java.lang.Object... args) {
    for (java.lang.Object o : args) {
        if (null == args)
            throw new java.lang.NullPointerException();
        
    }
}