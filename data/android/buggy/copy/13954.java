private void CheckForBrewDisplay() {
    if ((getActivity().getLocalClassName().equals("Brews.UserBrew")) || (getActivity().getLocalClassName().equals("Global.UserGlobal")))
        isBrewDisplay = true;
    
}