private void print(java.util.Collection<java.lang.Long> minUCCs) {
    for (java.lang.Long ucc : minUCCs) {
        java.lang.System.out.print(com.dataprofiling.ucc.helper.Bits.convert(ucc));
    }
    java.lang.System.out.println();
}