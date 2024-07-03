package com.portfolio.geraldine.model.skills;

import jakarta.validation.constraints.NotNull;

public record DatosSkills(
        @NotNull
        Long id,
        String name,
        String level,
        String experience
) {
}
