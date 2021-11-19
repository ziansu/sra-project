@java.lang.Override
public void onPrepareLoad(android.graphics.drawable.Drawable placeHolderDrawable) {
    profilePic.setImageDrawable(android.support.v4.content.ContextCompat.getDrawable(profilePic.getContext(), R.drawable.contact_icon));
    smallProfilePic.setImageDrawable(android.support.v4.content.ContextCompat.getDrawable(smallProfilePic.getContext(), R.drawable.contact_icon));
}