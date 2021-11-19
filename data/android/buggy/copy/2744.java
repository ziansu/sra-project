public boolean checkCampaignComplete() {
    return (((currentBattle) + 1) >= (meridor.Campaign.BATTLES_PER_SCENARIO)) && (((currentScenario) + 1) >= ((scenarios.size()) - 1));
}