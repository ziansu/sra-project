@java.lang.Override
public void onClick(android.view.View v) {
    brush_size = ((int) (sizeSetter.findViewById(R.id.slider_dialog).getX()));
    sizeSetter.dismiss();
}