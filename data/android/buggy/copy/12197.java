@java.lang.Override
public void updateProgress(java.lang.String state) {
    view().render(new com.nazacheres.onlinetrends.screens.start.StartModel.WhatPopularLoadingState(state, null));
}