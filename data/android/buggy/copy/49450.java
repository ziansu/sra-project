public static float getDensity() {
    org.michaelbel.material.util.Utils.density = org.michaelbel.material.util.Utils.context.getResources().getDisplayMetrics().density;
    return org.michaelbel.material.util.Utils.density;
}