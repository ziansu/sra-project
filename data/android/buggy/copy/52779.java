@java.lang.Override
public com.bean.Music save(com.bean.Music music) {
    updateInfo(music);
    musicRepository.save(music);
    return music;
}