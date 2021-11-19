@java.lang.Override
public final void onValidate(@android.support.annotation.NonNull
com.alexandrepiveteau.library.tutorial.ui.fragments.AbstractTutorialValidationFragment fragment, boolean is_ok) {
    if (is_ok) {
        _avoid_try_validate = true;
        onClick(mImageButtonRight);
        _avoid_try_validate = false;
    }
    invalidateSwipable();
}