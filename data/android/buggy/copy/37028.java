@java.lang.Override
public void update(java.util.Observable o, java.lang.Object arg) {
    android.util.Log.i("Update: ", "Update Called");
    send(((edu.byui.cs246.scandroid.Scanner) (o)).getScan());
}