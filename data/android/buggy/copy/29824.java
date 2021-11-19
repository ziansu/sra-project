private boolean isLeoEligible(io.github.theangrydev.opper.recogniser.DottedRule dottedRule) {
    return (rightRecursion.isRightRecursive(dottedRule.rule())) && (currentEarlySet().isLeoUnique(dottedRule));
}