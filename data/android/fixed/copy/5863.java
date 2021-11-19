@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.v("dimamir999", "handle click on add photo button");
    presenter.addNewPhoto(photoView.getDrawable());
}