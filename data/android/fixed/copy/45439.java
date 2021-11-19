@java.lang.Override
public java.util.List<java.lang.String> getAllPlanNames() {
    return dataBroker.selectAll(com.jnutrition.model.Plan.class).stream().map(Plan::getName).collect(java.util.stream.Collectors.toList());
}