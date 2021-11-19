void initialize(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    mImpl = com.slaterama.fab2.widget.roundedbutton.RoundedButtonImpl.newInstance(this, fillAttributes(context, attrs, defStyleAttr, defStyleRes));
}