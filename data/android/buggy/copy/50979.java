@java.lang.Override
public void onPageSelected(int position) {
    android.widget.Toast.makeText(getApplicationContext(), ("Trip " + (position + 1)), Toast.LENGTH_SHORT).show();
}