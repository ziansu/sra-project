@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    android.os.Bundle args = getArguments();
    int id = args.getInt(com.michael.attackpoint.discussion.DiscussionFragment.DISCUSSION_ID);
    mPresenter = new com.michael.attackpoint.discussion.DiscussionPresenter(com.michael.attackpoint.log.data.LogRepositories.getRepoInstance(), this, id);
}