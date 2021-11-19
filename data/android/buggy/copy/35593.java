private static PatchSet.Id toPsId(com.google.gerrit.reviewdb.client.Change.Id id, java.lang.String psIdStr) {
    return new com.google.gerrit.reviewdb.client.PatchSet.Id(id, (psIdStr.equals("edit") ? 0 : java.lang.Integer.parseInt(psIdStr)));
}