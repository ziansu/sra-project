private void checkReadAcl(us.kbase.shock.client.ShockNode node, java.util.List<us.kbase.shock.client.ShockUserId> uuids) throws java.lang.Exception {
    org.junit.Assert.assertThat("correct shock acls", node.getACLs().getRead(), org.hamcrest.CoreMatchers.is(uuids));
}