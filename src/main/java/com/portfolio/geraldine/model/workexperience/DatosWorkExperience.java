package com.portfolio.geraldine.model.workexperience;

import jakarta.validation.constraints.NotNull;

public record DatosWorkExperience(
        @NotNull
        Long id,
        String company,
        String contractStart,
        String contractEnd,
        String position,
        String description
) {
}
