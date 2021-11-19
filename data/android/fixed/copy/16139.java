private eu.adlogix.appnexus.oas.client.domain.ZoneCampaignTargeting parseAndCreateZoneTargeting(final eu.adlogix.appnexus.oas.client.xml.ResponseParser parser) {
    final eu.adlogix.appnexus.oas.client.domain.ZoneCampaignTargeting targeting = new eu.adlogix.appnexus.oas.client.domain.ZoneCampaignTargeting();
    populateTargetingValues(targeting, TargetingCode.ZONE, parser);
    return targeting;
}