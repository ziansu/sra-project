private java.lang.String getAccessTokenForPublisher() {
    return getAccessToken(("apim:api_view apim:api_create apim:api_publish apim:tier_view apim:tier_manage " + "apim:subscription_view apim:subscription_block apim:workflow_approve"));
}