public static void setFarPlane(float farPlane) {
    main.java.VolatiliaOGL.settings.VideoSettings.FAR_PLANE = farPlane;
    MasterRenderer.INSTANCE.createProjectionMatrix(main.java.VolatiliaOGL.settings.VideoSettings.FOV, main.java.VolatiliaOGL.settings.VideoSettings.NEAR_PLANE, main.java.VolatiliaOGL.settings.VideoSettings.FAR_PLANE);
}