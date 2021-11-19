public static org.xcolab.client.sharedcolab.pojo.Member registerInPartnerColab(org.xcolab.client.sharedcolab.pojo.Member member) {
    org.xcolab.client.sharedcolab.SharedColabClient.memberService.setServiceHost(ConfigurationAttributeKey.PARTNER_COLAB_LOCATION.get());
    org.xcolab.client.sharedcolab.SharedColabClient.memberService.setServicePort(ConfigurationAttributeKey.PARTNER_COLAB_PORT.get());
    return org.xcolab.client.sharedcolab.SharedColabClient.memberResource.service("registerFromSharedColab", org.xcolab.client.sharedcolab.pojo.Member.class).post(member);
}