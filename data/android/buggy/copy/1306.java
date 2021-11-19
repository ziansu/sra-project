@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    edu.washington.ischool.commoncents.commoncents.DataRepository.getInstance().unsubscribeFromUserCollectionUpdates(adapter);
}