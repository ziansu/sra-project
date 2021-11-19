@java.lang.Override
public void onClick(android.view.View view) {
    if ((mContext) instanceof com.jaylecavalier.chessvisionplus.DefaultActivity) {
        java.lang.String coord = itemIdToCoord(getItemId(f_position));
        ((com.jaylecavalier.chessvisionplus.DefaultActivity) (mContext)).checkIfCorrect(coord, f_imageView);
    }
}