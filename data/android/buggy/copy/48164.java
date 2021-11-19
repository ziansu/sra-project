@org.junit.Test
public void testGetSetUGI() throws java.io.IOException {
    java.nio.file.Path rootPath = java.nio.file.Paths.get(hdfs.jsr203.TestUserPrincipalLookupService.clusterUri);
    java.nio.file.attribute.UserPrincipal user = java.nio.file.Files.getOwner(rootPath, java.nio.file.LinkOption.NOFOLLOW_LINKS);
    org.junit.Assert.assertNotNull(user);
    java.nio.file.Files.setOwner(rootPath, user);
}