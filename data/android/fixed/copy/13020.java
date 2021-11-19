public DataBean.PicBean getItem(int position) {
    if (isGallery)
        return gallery2PicBean(myFavorites.get(position));
    
    return mPics.get(position);
}