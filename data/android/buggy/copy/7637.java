public void mutation(algorithm.Mutation mutation) {
    algorithm.Population.logger.info("Мутация в популяции. Начало");
    mutation.mutate(individuals, individualsAmount);
    algorithm.Population.logger.info("Мутация в популяции. Окончание");
}