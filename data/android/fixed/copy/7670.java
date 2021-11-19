@org.junit.Test
public void shouldRenderStatusTextView() {
    android.widget.TextView textView = ((android.widget.TextView) (activity.findViewById(R.id.status)));
    assertNotNull(textView);
}