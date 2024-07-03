package com.portfolio.geraldine.model.aboutme;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarAboutme(
        @NotNull
        Long id,

        String photo,

        String aboutMe,

        String email,

        String phone,

        String ubication,

        String resume
) {
}
