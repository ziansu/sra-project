private void queueResearch(SCBot.ResearchType upgrade) {
    this.economy.reserveResources(upgrade.mineralCost(), upgrade.gasCost());
    this.researchQueue.add(upgrade);
}