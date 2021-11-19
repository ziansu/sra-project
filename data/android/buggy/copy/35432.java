public static boolean isProcedurePartitioned(org.voltdb.catalog.Procedure proc) {
    return (proc.getSinglepartition()) || ((proc.getPartitioncolumn2()) == null);
}