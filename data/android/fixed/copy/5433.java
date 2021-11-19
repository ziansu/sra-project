@java.lang.Override
public void onBindViewHolder(cn.six.sup.rv.RvViewHolder holder, int position) {
    if (((data) != null) && ((data.size()) > position)) {
        apply(holder, data.get(position), position);
    }
}