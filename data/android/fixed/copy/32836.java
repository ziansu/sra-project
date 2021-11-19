@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent newProfile = new android.content.Intent(v.getContext(), com.github.joey.mansbestfriend.Profile.class);
    startActivityForResult(newProfile, 3);
}