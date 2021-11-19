@java.lang.Override
public org.spine3.users.TenantId apply(@javax.annotation.Nullable
com.google.cloud.datastore.Key input) {
    org.junit.Assert.assertNotNull(input);
    return org.spine3.users.TenantId.newBuilder().setValue(input.getName().substring(1)).build();
}