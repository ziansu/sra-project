public android.widget.Toast makeToast(int textId) {
    android.content.Context context = getContext();
    if (context == null)
        return null;
    
    return android.widget.Toast.makeText(context, textId, Toast.LENGTH_SHORT);
}