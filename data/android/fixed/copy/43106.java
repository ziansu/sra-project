@java.lang.Override
public void onChanged(@android.support.annotation.Nullable
com.abnormallydriven.architecturecomponentspost.common.data.entities.User[] users) {
    if (users != null) {
        userListAdapter.update(users);
    }else {
        userListAdapter.update(new com.abnormallydriven.architecturecomponentspost.common.data.entities.User[0]);
    }
}