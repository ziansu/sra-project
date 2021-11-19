public void testSetIsPrivate() {
    dk.aau.sw808f16.datacollection.campaign.Campaign campaign = new dk.aau.sw808f16.datacollection.campaign.Campaign();
    campaign.setPrivate(true);
    assertTrue(campaign.isPrivate());
}