@java.lang.Override
public void onItemBind(me.tatarka.bindingcollectionadapter2.ItemBinding itemBinding, int position, org.unimelb.itime.ui.viewmodel.activity.ActivityMessageViewModel item) {
    itemBinding.set(BR.messageViewGroup, (position >= 3 ? R.layout.itime_activity_message_bottom : R.layout.itime_activity_meeting_message));
}