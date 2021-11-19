private static soze.multilife.game.rule.Rule getRule(soze.multilife.game.rule.RuleType type) {
    return java.util.Objects.requireNonNull(type).getRule();
}