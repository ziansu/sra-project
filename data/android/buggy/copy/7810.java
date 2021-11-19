@java.lang.Override
public void onItemSelected(com.jaredrummler.materialspinner.MaterialSpinner view, int position, long id, java.lang.String item) {
    chosenDollar = item;
    callBack.updateUSD(chosenDollar, rateData.get(position).getRate());
}