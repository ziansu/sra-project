public static rpg_database.character_sheet.CharacterSheet createCharacterSheetWithCustomLevelBaseClass(int level, rpg_database.character_sheet.BaseClasses baseClass) {
    rpg_database.character_sheet.CharacterSheet characterSheet = new rpg_database.character_sheet.CharacterSheet("CharacterSheet");
    characterSheet.setData(Fields.BASECLASS, baseClass);
    characterSheet.setData(Fields.LEVEL, level);
    return characterSheet;
}