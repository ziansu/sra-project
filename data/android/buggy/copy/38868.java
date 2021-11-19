public cn.hackingwu.search.Condition and(java.lang.String property, cn.hackingwu.search.Operator operator, java.lang.Object value) {
    cn.hackingwu.search.Condition condition = new cn.hackingwu.search.Condition(property, operator, value, this.orConditionChain, this.andConditionChain);
    condition.andConditionChain.add(this);
    return condition;
}