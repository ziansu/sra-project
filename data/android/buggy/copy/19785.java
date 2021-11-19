@org.junit.Test
public void should_return_global_permissions_for_anonymous() {
    setupData("should_return_global_permissions_for_anonymous");
    org.sonar.core.user.AuthorizationDao authorization = new org.sonar.core.user.AuthorizationDao(getMyBatis());
    org.assertj.core.api.Assertions.assertThat(authorization.selectGlobalPermissions(null)).containsOnly("user", "admin");
}