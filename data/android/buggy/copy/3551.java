private void setupTextView() {
    mProgressSpinner.setVisibility(View.GONE);
    mWrapper.setVisibility(View.VISIBLE);
    mTitle.setText(title);
    mBody.setText(android.text.Html.fromHtml(content));
}