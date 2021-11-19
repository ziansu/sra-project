public static void PerfLogPrintln(java.lang.String s) {
    if (utilities.Utilities.PERFLOG) {
        if ((utilities.Utilities.debug_ps) == null) {
            return ;
        }else {
            utilities.Utilities.perf_ps.println(s);
        }
    }
}