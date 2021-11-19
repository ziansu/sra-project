public void ignoreAttributeProbability(int ignoreAttributeProbability) {
    config.put(quickml.supervised.tree.decisionTree.treeBuildContexts.ATTRIBUTE_IGNORING_STRATEGY.name(), new quickml.supervised.tree.attributeIgnoringStrategies.IgnoreAttributesWithConstantProbability(ignoreAttributeProbability));
}