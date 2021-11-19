@java.lang.Override
public void onClick(android.view.View view) {
    mListener.onEmail(holder.email.getText().toString(), false);
}