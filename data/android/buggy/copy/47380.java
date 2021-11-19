@java.lang.Override
public com.social.messapp34.model.Conversation getItem(int position) {
    if ((convList.size()) > 0)
        return convList.get(position);
    else
        return null;
    
}