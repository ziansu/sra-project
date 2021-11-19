public void addClaim(ca.ualberta.cs.scandaloutraveltracker.Claim claim) {
    claimList.addClaim(claim);
    java.util.Collections.sort(claimList.getClaims());
}