public void testSetIsPrivate() {
    dk.aau.sw808f16.datacollection.campaign.Campaign campaign = new dk.aau.sw808f16.datacollection.campaign.Campaign();
    boolean expected = true;
    campaign.setPrivate(expected);
    assertEquals(expected, campaign.isPrivate());
}