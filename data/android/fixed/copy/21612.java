public boolean isDataValid() {
    return (guncreator.utils.EnumChecker.isValidSound(sound_name_1.getText())) && ((guncreator.utils.EnumChecker.isValidSound(sound_name_2.getText())) || (sound_name_2.getText().isEmpty()));
}