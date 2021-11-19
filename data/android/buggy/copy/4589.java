@java.lang.SuppressWarnings(value = "deprecation")
public static android.text.Spanned fromHtml(java.lang.String text) {
    if (org.linphone.mediastream.Version.sdkAboveOrEqual(Version.API24_NOUGAT_70)) {
        return android.text.Html.fromHtml(text, Html.FROM_HTML_MODE_LEGACY);
    }else {
        return android.text.Html.fromHtml(text);
    }
}