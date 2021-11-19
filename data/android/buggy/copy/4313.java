@java.lang.Override
protected void publishResults(java.lang.CharSequence constraint, com.streetsnax.srinidhi.streetsnax.adapters.FilterResults results) {
    if ((results != null) && ((results.count) > 0)) {
        notifyDataSetChanged();
    }else {
    }
}