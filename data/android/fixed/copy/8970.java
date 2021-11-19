public void add(greymerk.roguelike.treasure.loot.LootRuleManager other) {
    if (other == null)
        return ;
    
    this.rules.addAll(other.rules);
}