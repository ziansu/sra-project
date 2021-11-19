@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mPage = getArguments().getInt(com.nathanromike.yes_you_can.ui.GuideListFragment.ARG_PAGE);
    getGuides(Constants.ELECTRONIC);
}