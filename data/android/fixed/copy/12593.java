public void ignoreAttributeProbability(double ignoreAttributeProbability) {
    config.put(quickml.supervised.tree.decisionTree.treeBuildContexts.ATTRIBUTE_IGNORING_STRATEGY.name(), new quickml.supervised.tree.attributeIgnoringStrategies.IgnoreAttributesWithConstantProbability(ignoreAttributeProbability));
}