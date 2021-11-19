public graphql.execution.ExecutionParameters transform(java.util.function.Consumer<graphql.execution.ExecutionStrategyParameters.Builder> builderConsumer) {
    graphql.execution.ExecutionStrategyParameters.Builder builder = graphql.execution.ExecutionStrategyParameters.newParameters(this);
    builderConsumer.accept(builder);
    return builder.build();
}