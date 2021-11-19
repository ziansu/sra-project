public static short randShort(short min, short max) {
    return ((short) ((panda.lang.Randoms.rand.nextInt((max - min))) + min));
}