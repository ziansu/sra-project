public static double toMicroMolar(double value, com.example.vishaalprasad.pcrapp.reactant_helpers.UnitHelper.ConcentrationUnit unit) {
    switch (unit) {
        case ConcentrationUnit.NANO_MOLAR :
            return value / 1000.0;
        case ConcentrationUnit.MILLI_MOLAR :
            return value * 1000;
        default :
            return value;
    }
}