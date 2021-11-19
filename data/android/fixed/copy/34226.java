@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    pageNumber = getArguments().getInt(ru.spbau.mit.antonpp.deepshot.fragment.HelpPageFragment.PageFragment.ARGUMENT_PAGE_NUMBER);
    if (savedInstanceState != null) {
        pageNumber = savedInstanceState.getInt(ru.spbau.mit.antonpp.deepshot.fragment.HelpPageFragment.PageFragment.ARGUMENT_PAGE_NUMBER);
    }
}