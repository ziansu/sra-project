@arash.app.earthshaker.SmallTest
public void testEditText() {
    android.widget.EditText editText = ((android.widget.EditText) (getActivity().findViewById(R.id.email)));
    org.junit.Assert.assertNotNull(editText);
}