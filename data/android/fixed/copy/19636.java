@java.lang.Override
public void onNext(com.zyascend.NoBoring.bean.ListResponse<com.zyascend.NoBoring.bean.FollowResponse> userResponse) {
    if (userResponse == null)
        return ;
    
    showListDialog(userResponse.getResults(), true);
}