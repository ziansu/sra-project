@java.lang.Override
public void onClick(com.mcal.ModdedPE.app.View p1) {
    getPESdk().getNModAPI().setEnabled(nmod, false);
    refreshNModDatas();
}