public void setEnemyelement() {
    java.util.Random rnd = new java.util.Random();
    rnd.setSeed(java.lang.System.currentTimeMillis());
    enemyelement = ((java.lang.Math.abs(rnd.nextInt())) % 4) + 1;
}