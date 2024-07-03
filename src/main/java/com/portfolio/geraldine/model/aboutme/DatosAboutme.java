package com.portfolio.geraldine.model.aboutme;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosAboutme(
        @NotNull
        Long id,
        @NotBlank
        String photo,
        @NotBlank
        String fullName,
        @NotBlank
        String aboutMe,
        @NotBlank
        String email,
        @NotBlank
        String phone,
        @NotBlank
        String ubication,
        @NotBlank
        String linkedinProfile,
        @NotBlank
        String githubProfile,
        @NotBlank
        String resume
) {
}
