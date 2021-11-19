public com.synacy.moviehouse.schedule.Schedule fetchById(java.lang.Long id) {
    com.synacy.moviehouse.schedule.Schedule schedule = scheduleRepository.findOne(id);
    if (schedule == null)
        throw new com.synacy.moviehouse.exception.NoContentFoundException("Not content found");
    
    return schedule;
}