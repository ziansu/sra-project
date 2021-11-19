private void assertNoMembers(java.lang.String group) throws java.lang.Exception {
    com.google.common.truth.Truth.assertThat(gApi.groups().id(group).members().isEmpty());
}