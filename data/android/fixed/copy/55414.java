@java.lang.Override
public int getItemViewType(int position) {
    position = ((hint) != null) ? position - 1 : position;
    return position == (-1) ? fr.ganfra.materialspinner.MaterialSpinner.HintAdapter.HINT_TYPE : mSpinnerAdapter.getItemViewType(position);
}