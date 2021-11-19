@org.junit.Test
public void testGetErrorMessage_defaultHeader() {
    java.lang.String message = yaccErrorBuilder.getErrorMessage(new java.util.ArrayList<com.isroot.stash.plugin.errors.YaccError>());
    org.assertj.core.api.Assertions.assertThat(message).isEqualTo((("\n" + (com.isroot.stash.plugin.errors.YaccErrorBuilder.ERROR_BEARS)) + "\n\n"));
}