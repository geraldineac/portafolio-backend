package com.portfolio.geraldine.controller;

import com.portfolio.geraldine.model.aboutme.Aboutme;
import com.portfolio.geraldine.model.aboutme.DatosActualizarAboutme;
import com.portfolio.geraldine.repository.AboutmeRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/aboutme")
public class AboutmeController {

    @Autowired
    private AboutmeRepository aboutmeRepository;

    @GetMapping("/{id}")
    public Aboutme getById(@PathVariable Long id) {
        return aboutmeRepository.findById(id)
                .map(aboutme -> new Aboutme(
                        aboutme.getId(),
                        aboutme.getPhoto(),
                        aboutme.getFullName(),
                        aboutme.getAboutMe(),
                        aboutme.getEmail(),
                        aboutme.getPhone(),
                        aboutme.getUbication(),
                        aboutme.getLinkedinProfile(),
                        aboutme.getGithubProfile(),
                        aboutme.getResume()
                ))
                .orElse(null);
    }

    @PostMapping
    public Aboutme createAboutme(@RequestBody Aboutme aboutme) {
        return aboutmeRepository.save(aboutme);
    }

    @PutMapping
    @Transactional
    public void actualizarAboutme(@RequestBody DatosActualizarAboutme datosActualizarAboutme){
        Aboutme aboutme = aboutmeRepository.getReferenceById(datosActualizarAboutme.id());
        aboutme.actualizarDatos(datosActualizarAboutme);
    }


}
