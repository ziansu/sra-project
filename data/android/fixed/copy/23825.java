@java.lang.Override
public int compare(pasta.music.data.AlbumListData o1, pasta.music.data.AlbumListData o2) {
    if (((o1.albumDate) == null) || ((o2.albumDate) == null))
        return 0;
    else
        return o1.albumDate.compareTo(o2.albumDate);
    
}