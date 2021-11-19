@org.junit.Test
public void savePrefs_nullPrefs_assertionFailure() throws java.io.IOException {
    thrown.expect(java.lang.AssertionError.class);
    saveUserPrefs(null, "SomeFile.json");
}