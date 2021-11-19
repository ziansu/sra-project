public static com.jaamsim.input.ExpValResult makeErrorRes(com.jaamsim.input.ExpError error) {
    java.util.ArrayList<com.jaamsim.input.ExpError> es = new java.util.ArrayList<>(1);
    return new com.jaamsim.input.ExpValResult(com.jaamsim.input.ExpValResult.State.ERROR, null, com.jaamsim.units.DimensionlessUnit.class, es);
}