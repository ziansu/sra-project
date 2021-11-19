@org.testng.annotations.Test(dependsOnMethods = { "requestRptAndGetNeedsInfo" })
@org.testng.annotations.Parameters(value = { "umaPatClientId" , "umaClaimsRedirectUri" })
public void claimsGathering(java.lang.String umaPatClientId, java.lang.String umaClaimsRedirectUri) throws java.lang.Exception {
    java.lang.String gatheringUrl = needInfo.buildClaimsGatheringUrl(umaPatClientId, umaClaimsRedirectUri);
    java.lang.System.out.println(gatheringUrl);
    try {
    } finally {
    }
}