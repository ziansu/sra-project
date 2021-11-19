@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    try {
        mImageUrlInterface = ((com.example.randomlocks.gamesnote.DialogFragment.ImageUrlFragment.ImageUrlInterface) (getActivity()));
    } catch (java.lang.Exception e) {
        com.example.randomlocks.gamesnote.HelperClass.Toaster.make(getContext(), "interface cast exception");
    }
}