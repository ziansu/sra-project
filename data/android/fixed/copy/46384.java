public void onClick(android.content.DialogInterface dialog, int id) {
    list.archived = true;
    com.liamfruzyna.android.wishlister.data.IO.getInstance().saveAndSync(list.name);
    ((com.liamfruzyna.android.wishlister.activities.ListerActivity) (getActivity())).loadActivity();
}