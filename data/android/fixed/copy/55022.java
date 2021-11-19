public void before(java.lang.String description, org.forgerock.cuppa.functions.HookFunction function) {
    assertNotRunningTests("before");
    assertNotRootDescribeBlock("before");
    getCurrentDescribeBlock().addBefore(java.util.Optional.ofNullable(description), function);
}