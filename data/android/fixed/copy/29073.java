public void setAttenuation(float constant, float linear, float quadratic) {
    setFloat("attenuation_constant", constant);
    setFloat("attenuation_linear", linear);
    setFloat("attenuation_quadratic", quadratic);
}