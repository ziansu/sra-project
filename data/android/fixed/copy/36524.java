@org.junit.Test
public void savePrefs_nullPrefs_assertionFailure() throws java.io.IOException {
    this.thrown.expect(java.lang.AssertionError.class);
    saveUserPrefs(null, "SomeFile.json");
}