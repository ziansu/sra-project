@java.lang.Override
public void onInit(com.androidsdk.snaphy.snaphyandroidsdk.list.DataList<com.androidsdk.snaphy.snaphyandroidsdk.models.PostDetail> dataList) {
    super.onInit(dataList);
    caseListAdapter = new com.orthopg.snaphy.orthopg.Fragment.CaseFragment.CaseListAdapter(mainActivity, dataList, com.orthopg.snaphy.orthopg.Fragment.CaseFragment.CaseFragment.TAG, casePresenter);
    recyclerView.setAdapter(caseListAdapter);
}