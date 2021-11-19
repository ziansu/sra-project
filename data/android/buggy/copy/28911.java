@java.lang.Override
public void onPageAppear() {
    isVisible = true;
    if ((needUpdate) && ((graphSpiner) != null))
        showGraph(graphSpiner.getSelectedItemPosition());
    
}