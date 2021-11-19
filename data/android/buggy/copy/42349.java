public org.ballerinalang.model.values.BValue[] execute(org.ballerinalang.bre.Context ctx) {
    org.ballerinalang.model.values.BDataTable dataTable = ((org.ballerinalang.model.values.BDataTable) (getRefArgument(ctx, 0)));
    return getBValues(dataTable.getNext(ctx.isInTransaction()));
}