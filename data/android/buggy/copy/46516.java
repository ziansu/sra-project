@java.lang.Override
public android.content.Loader<java.util.List<fr.sims.coachingproject.model.UserProfile>> onCreateLoader(int id, android.os.Bundle args) {
    return new fr.sims.coachingproject.loader.network.GroupMembersLoader(getContext(), mGroupId, true);
}