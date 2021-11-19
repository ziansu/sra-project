@java.lang.Override
public com.bean.Music update(java.lang.Integer id, com.bean.Music music) {
    music = musicRepository.update(id, music);
    musicRepository.save(music);
    return music;
}