package com.portfolio.geraldine.model.aboutme;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "aboutme")
@Entity(name = "Aboutme")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Aboutme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String photo;
    private String fullName;
    private String aboutMe;
    private String email;
    private String phone;
    private String ubication;
    private String linkedinProfile;
    private String githubProfile;
    private String resume;

    public Aboutme(DatosAboutme datosAboutme){
        this.id = datosAboutme.id();
        this.photo = datosAboutme.photo();
        this.fullName = datosAboutme.fullName();
        this.aboutMe = datosAboutme.aboutMe();
        this.email = datosAboutme.email();
        this.phone = datosAboutme.phone();
        this.ubication = datosAboutme.ubication();
        this.linkedinProfile = datosAboutme.linkedinProfile();
        this.githubProfile = datosAboutme.githubProfile();
        this.resume = datosAboutme.resume();

    }

    public void actualizarDatos(DatosActualizarAboutme datosAboutme) {
        if (datosAboutme.photo() != null) {
            this.photo = datosAboutme.photo();
        }
        if(datosAboutme.aboutMe() != null){
            this.aboutMe = datosAboutme.aboutMe();
        }
        if(datosAboutme.email() != null){
            this.email = datosAboutme.email();
        }
        if(datosAboutme.phone() != null){
            this.phone = datosAboutme.phone();
        }
        if(datosAboutme.ubication() != null){
            this.ubication = datosAboutme.ubication();
        }
        if(datosAboutme.resume() != null){
            this.resume = datosAboutme.resume();
        }
    }
}
