@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mLogInData = getArguments().getStringArrayList(nl.rug.www.summerschool.controller.myprofile.MyProfileFragment.ARG_CONTENT_ID);
}