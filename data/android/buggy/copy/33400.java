public com.vampiroTech.model.Goal save(com.vampiroTech.model.Goal goal) {
    @org.springframework.beans.factory.annotation.Autowired
    com.vampiroTech.repository.GoalRepository goalRespository;
    return goalRepository.save(goal);
}