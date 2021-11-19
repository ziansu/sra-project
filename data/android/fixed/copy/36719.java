private void markDestructable(final org.apache.nifi.controller.repository.claim.ResourceClaim resourceClaim) {
    if (resourceClaim == null) {
        return ;
    }
    claimManager.markDestructable(resourceClaim);
}