protected void selectedBack() {
    com.thud.thpt_dh.utils.interfaces.Flags.vitri_cauhoi -= 1;
    vitri_cauhoi -= 1;
    setValue();
    setData();
    if ((com.thud.thpt_dh.utils.interfaces.Flags.loai_dethi) == false) {
        setSelected();
    }
}