@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((resultCode == (RESULT_OK)) && (requestCode == (etec.coda_softwares.meupdv.Caixa.REQ_CAIXA))) {
        finish();
    }
}