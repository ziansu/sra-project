@java.lang.Override
public void onClick(android.view.View onClickView) {
    com.example.kangjisung.likeroom.FragmentStamp.StampUseDialog stampUseDialog = new com.example.kangjisung.likeroom.FragmentStamp.StampUseDialog(context, activity, ((((position + 1) * 2) - 1) * (com.example.kangjisung.likeroom.DefineManager.standardMileage)));
    stampUseDialog.show();
}