public void show(com.rfo.basic.GR.VISIBLE show) {
    switch (show) {
        case SHOW :
            mVisible = true;
        case HIDE :
            mVisible = false;
        case TOGGLE :
            mVisible = !(mVisible);
    }
}