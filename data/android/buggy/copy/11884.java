static boolean cWithinDev(java.awt.Color a, int b, int dev) {
    return (java.lang.Math.abs(supportai_evolution.SAIE_Util.colorDif(a, supportai_evolution.SAIE_Util.PixeltoColor(b)))) <= dev;
}