@java.lang.Override
public int getItemViewType(int position) {
    if (position == 0) {
        return ch.dominikroos.soundslasher.TimeListAdapter.VIEW_TYPE_HEADER;
    }else
        if (position <= (mDataset.size())) {
            return ch.dominikroos.soundslasher.TimeListAdapter.VIEW_TYPE_TIME_VIEW;
        }else {
            return ch.dominikroos.soundslasher.TimeListAdapter.VIEW_TYPE_ADDITIONAL_VIEW;
        }
    
}