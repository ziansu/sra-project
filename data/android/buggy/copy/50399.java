@java.lang.Override
public long getItemId(int position) {
    return mController.mUsers.get(position).info.id;
}