public double getFitnessValue() {
    if (((m_fitnessValue) >= 0.0) && (!(reEvaluate))) {
        return m_fitnessValue;
    }else {
        return calcFitnessValue();
    }
}