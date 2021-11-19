private void BackupInCGX() {
    Track.SaveCGX(((((DataDir) + "/") + (course_generator.utils.CgConst.CG_DIR)) + "/backup.cgx"), 0, ((Track.data.size()) - 1), true);
    bNoBackup = false;
}