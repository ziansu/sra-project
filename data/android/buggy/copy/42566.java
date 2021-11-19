@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.System.out.println("clicked button2!");
    new com.example.robin.androidproject3b.MainActivity.SendDataToServerTask().execute();
}