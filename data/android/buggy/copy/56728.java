public void write(byte[] buffer) {
    try {
        mmOutStream.write("Hej .. It Worked".getBytes());
    } catch (java.io.IOException e) {
        android.widget.Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
    }
}