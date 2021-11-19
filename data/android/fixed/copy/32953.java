@java.lang.Override
public void onClick(android.view.View view) {
    if ((rowItem.getEntry()) != null) {
        toggleChecked(position, holder.checkImageView);
    }
}