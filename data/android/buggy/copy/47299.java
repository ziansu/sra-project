private void init() {
    progressBar = ((android.widget.ProgressBar) (findViewById(R.id.loading_progressBar)));
    tipTxt = ((android.widget.TextView) (findViewById(R.id.tip_txt)));
    setOnClickListener(this);
    eventBus = new org.greenrobot.eventbus.EventBus();
}