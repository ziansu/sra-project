@java.lang.Override
protected void onFinishInflate() {
    super.onFinishInflate();
    butterknife.ButterKnife.bind(this);
    setOnClickListener(this);
    attach();
}