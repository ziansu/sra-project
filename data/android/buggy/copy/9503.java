public static com.cggcoding.models.Stage getInstanceAndCreateID(java.lang.String name, java.lang.String description, int order) {
    int stageID = java.lang.Math.abs(new java.util.Random(10000).nextInt());
    return new com.cggcoding.models.Stage(stageID, name, description, order);
}