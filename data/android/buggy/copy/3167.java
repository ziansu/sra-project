@java.lang.Override
public long getItemId(int position) {
    if (position <= (albumDetailsList.size()))
        return albumDetailsList.get(position).getPhotoID();
    else
        return (albumDetailsList.size()) + 1;
    
}