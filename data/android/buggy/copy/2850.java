@org.junit.Test
public void saveUserPrefs_nullFilePath_assertionFailure() throws java.io.IOException {
    thrown.expect(java.lang.AssertionError.class);
    saveUserPrefs(new seedu.doit.model.UserPrefs(), null);
}