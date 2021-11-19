public static java.lang.String doSleep() throws co.paralleluniverse.fibers.SuspendExecution {
    try {
        if (false)
            co.paralleluniverse.strands.Strand.sleep(1);
        
        return "hello world";
    } catch (java.lang.InterruptedException ex) {
        throw new java.lang.RuntimeException(ex);
    }
}