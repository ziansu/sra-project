public void startTutorial() {
    if (!(wasTutorialAlreadyShown())) {
        tutorialLayout.setVisibility(View.VISIBLE);
        persistTutorialShown();
    }else {
        tutorialRendererListener.onTutorialFinished();
    }
}