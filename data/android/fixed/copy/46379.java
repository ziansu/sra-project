public static void writeVolumeFMState(int volumeFM) {
    es.carlosrolindez.kbfinder.SelectBtActivity.sendSppMessage((("VOL " + (java.lang.String.valueOf(volumeFM))) + "\r"), false);
}