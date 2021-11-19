@org.junit.Test
public void should_return_global_permissions_for_anonymous() {
    setupData("should_return_global_permissions_for_anonymous");
    org.assertj.core.api.Assertions.assertThat(authorization.selectGlobalPermissions(null)).containsOnly("user", "admin");
}