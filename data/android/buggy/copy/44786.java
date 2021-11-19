@java.lang.Override
public void onBackPressed() {
    if (searched) {
        searched = false;
        presenter.setSearchParameters(new com.gmail.mateuszmonas.macroapp.fakturasearch.FakturaSearchParameters());
        presenter.loadFaktury(0, true);
    }else {
        super.onBackPressed();
    }
}