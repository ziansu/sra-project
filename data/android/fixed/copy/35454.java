public io.pity.api.environment.EnvironmentDataBuilder addData(java.lang.String name, java.lang.String data) {
    environmentData.getEnvironmentResults().put(name, data);
    return this;
}