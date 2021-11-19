@java.lang.Override
protected void subRules(java.util.Set<dfh.grammar.Rule> set) {
    if (!(set.contains(this))) {
        set.add(this);
        r.subRules(set);
    }
}