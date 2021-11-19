@java.lang.Override
public es.metichi.animabeyondfantasy.CharacterSheet.Definitions.CategoryModifier getHpByLevel() {
    es.metichi.animabeyondfantasy.CharacterSheet.Definitions.CategoryModifier hpModifier = new es.metichi.animabeyondfantasy.CharacterSheet.Definitions.CategoryModifier("Clase Guerrero", "Guerreros ganan 15HP por nivel", new java.lang.String[]{ "HP" }) {
        @java.lang.Override
        public int getValue() {
            return 15 * (getLevel());
        }
    };
    return hpModifier;
}