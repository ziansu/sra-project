@java.lang.Override
public void onViewAttachedToWindow(com.dnkilic.karabasan.DialogAdapter.ViewHolder holder) {
    super.onViewAttachedToWindow(holder);
    if (((holder.etAnswer) != null) && ((holder.etAnswer.getText().length()) == 0)) {
        holder.etAnswer.requestFocus();
    }
}