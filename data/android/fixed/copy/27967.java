android.text.Spanned enrichText(java.lang.String text) {
    return android.text.Html.fromHtml(text.replaceAll("\\{(.*)\\}", "<font color=#4caf50>$1</font>"));
}