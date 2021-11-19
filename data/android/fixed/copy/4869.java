@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    koofService = org.bosik.diacomp.android.backend.common.Storage.getKoofService(getContentResolver());
    super.onCreate(savedInstanceState);
}