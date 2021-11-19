@java.lang.Override
public void onCancelled(com.firebase.client.FirebaseError firebaseError) {
    java.lang.System.out.println(("The read failed: " + (firebaseError.getMessage())));
    done.countDown();
}