public eu.symphony.data.dto.SkillDTO toDTO(eu.symphony.data.entity.Skill skill) {
    eu.symphony.data.dto.SkillDTO skillDTO = new eu.symphony.data.dto.SkillDTO();
    skillDTO.id = skill.getId();
    skillDTO.name = skill.getName();
    skillDTO.description = skill.getDescription();
    return skillDTO;
}