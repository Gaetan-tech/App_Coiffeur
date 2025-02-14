package org.example.app_coiffure.model;

import ch.qos.logback.core.status.Status;

import java.time.LocalDateTime;

public class RendezVous {
    private int rendezVousId;
    private int creneauId;
    private String clientNom;
    private String clientTelephone;
    private String clientEmail;
    private LocalDateTime dateReservation;
    private Status status;
}
