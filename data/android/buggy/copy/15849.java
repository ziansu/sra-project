@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    setLiveButtonAppearance((!(gui_.isLiveModeOn())));
    cameras_.enableLiveMode((!(gui_.isLiveModeOn())));
}