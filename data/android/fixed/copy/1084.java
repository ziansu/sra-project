public eu.symphony.data.entity.Skill toEntity(eu.symphony.data.dto.SkillDTO skillDTO) {
    eu.symphony.data.entity.Skill skill = new eu.symphony.data.entity.Skill();
    skill.setId(skillDTO.id);
    skill.setName(skillDTO.name);
    return skill;
}