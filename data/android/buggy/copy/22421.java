@java.lang.Override
public void onBackPressed() {
    if (fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard.backPress())
        return ;
    else
        if (fm.jiecao.jcvideoplayer_lib.PlayerTwo.JCVideoPlayerStandardTwo.backPress())
            return ;
        else {
            super.onBackPressed();
        }
    
}