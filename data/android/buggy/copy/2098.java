@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_get_ip);
    io.github.hendraanggrian.circularrevealanimator.CircularRevealAnimator.of(this).onCreate(R.id.text);
}