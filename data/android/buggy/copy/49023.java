@java.lang.Override
public void onSuccess(java.util.List<com.foodie.app.entities.Activity> data) {
    for (com.foodie.app.entities.Activity item : data) {
        com.foodie.app.listsDB.ContentResolverDatabase.setActivityList(data, size);
        callBack.onSuccess(null);
    }
}