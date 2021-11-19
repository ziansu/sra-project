public boolean checkCampaignComplete() {
    return (((currentBattle) + 1) >= (meridor.Campaign.BATTLES_PER_SCENARIO)) && ((currentScenario) >= ((scenarios.size()) - 1));
}