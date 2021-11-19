@java.lang.Override
public void onBindViewHolder(edu.uw.tcss450.group8.frolicker.PrefsInitAdapter.Holder holder, int position) {
    position = holder.getAdapterPosition();
    holder.mName.setText(mKeyList.get(position));
}