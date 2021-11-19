private void disPlayVideo(java.lang.String linkVideo) {
    if (linkVideo == null)
        return ;
    
    setVideoUri(linkVideo);
    playVideo(linkVideo);
}