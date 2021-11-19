private void setSeekBarValues(org.adw.library.widgets.discreteseekbar.DiscreteSeekBar.NumericTransformer transformers, int min, int max, int current) {
    mSeekBar.setNumericTransformer(transformers);
    mSeekBar.setMin(min);
    mSeekBar.setMax(max);
    mSeekBar.setProgress(current);
}