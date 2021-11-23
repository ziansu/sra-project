public RayTracing.Material getMaterial(RayTracing.Scene scene) {
    java.util.List<RayTracing.Material> materialsList = scene.getMaterialsList();
    return materialsList.get(((materialIndex) - 1));
}