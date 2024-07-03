package com.portfolio.geraldine.model.education;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosEducation(
        @NotNull
        Long id,
        @NotBlank
        String name,
        @NotBlank
        String institution,
        @NotBlank
        String year,
        @NotBlank
        String description
) {
}
