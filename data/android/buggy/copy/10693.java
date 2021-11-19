@java.lang.Override
public void onShowPreview() {
    fabAddProblem.setVisibility(View.INVISIBLE);
    showTitle.setMaxLines(1);
    showTitle.setEllipsize(TextUtils.TruncateAt.END);
}