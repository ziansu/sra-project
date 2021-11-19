@java.lang.Override
public void setAdapter(android.widget.SpinnerAdapter adapter) {
    if (adapter instanceof fr.ganfra.materialspinner.MaterialSpinner.HintAdapter) {
        super.setAdapter(adapter);
    }else {
        hintAdapter = new fr.ganfra.materialspinner.MaterialSpinner.HintAdapter(adapter, getContext());
        super.setAdapter(hintAdapter);
    }
}