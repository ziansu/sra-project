@java.lang.Override
public void onSuccess(java.lang.String message) {
    name1.setText(file.getAbsolutePath());
    new com.example.roman.audiocuttertest.io.AudioLoader(context, mypath, tmp).start();
    com.example.roman.audiocuttertest.MainActivity.saveLastFile(context, mypath.getAbsolutePath());
}