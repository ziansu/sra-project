public void setChecked(java.lang.String id, boolean data) {
    for (io.github.sdsstudios.ScoreKeeper.Options.CheckBoxOption s : mCheckBoxOptions) {
        if (s.getmID().equals(id)) {
            s.setData(data);
        }
    }
}