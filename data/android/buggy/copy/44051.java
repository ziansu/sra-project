@java.lang.Override
public int getItemCount() {
    android.util.Log.d("SESSION SIZE", java.lang.Integer.toString(com.matthew.gymapp.SessionStore.getSize()));
    return com.matthew.gymapp.SessionStore.getSize();
}