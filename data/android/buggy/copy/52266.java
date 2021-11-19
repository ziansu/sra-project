private void setupText() {
    mTextViewAbout = ((android.widget.TextView) (findViewById(R.id.text_view_about)));
    mTextViewAbout.setText(android.text.Html.fromHtml(getString(R.string.about)));
    mTextViewAbout.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
}