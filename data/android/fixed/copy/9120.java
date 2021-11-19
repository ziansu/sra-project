@java.lang.Override
public int getItemViewType(int position) {
    if (position == (listMember.size())) {
        return ADD;
    }else {
        return MEMBER;
    }
}