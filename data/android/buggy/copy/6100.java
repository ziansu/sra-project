@java.lang.Override
public me.nereo.multi_image_selector.bean.Folder getItem(int i) {
    if (i == 0)
        return null;
    
    return mFolders.get((i - 1));
}