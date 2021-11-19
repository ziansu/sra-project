@android.support.annotation.Nullable
@butterknife.OnClick(value = R.id.stop)
void stop() {
    presenter.stopStream(getCachedMelody());
}