public static void testRemoveKeychain(postit.server.controller.KeychainHandler kh, int directoryEntryId) {
    boolean res = kh.removeKeychain(directoryEntryId);
    java.lang.System.out.printf("Removing keychain %d %s\n", directoryEntryId, (res ? "successful" : "failed"));
}