@android.databinding.BindingAdapter(value = "humanReadableByteCount")
public static void setHumanReadableByteCount(android.widget.TextView textView, long byteCount) {
    textView.setText(cz.koto.misak.dbshowcase.android.mobile.utility.FileUtils.humanReadableByteCount(byteCount, true));
}