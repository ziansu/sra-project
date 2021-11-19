@org.testng.annotations.Test(expectedExceptions = java.lang.IllegalArgumentException.class)
public void inputDataForValidateAvatarFormatIsNull() throws java.lang.Exception {
    avatarService.validateAvatarFormat(null);
}