public static void removeEntryFromPendingIaByImageId(java.lang.String imageId, javax.servlet.http.HttpServletRequest request) throws java.lang.Exception {
    try {
        org.ecocean.TwitterUtil.removeEntryFromPendingIaByGenericString("photoId", imageUrl, request);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        throw new java.lang.Exception("removeEntryFromPendingIaByImageId in TwitterUtil.java failed");
    }
}