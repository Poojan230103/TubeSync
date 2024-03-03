package com.tubesync.tubesyncbackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Collaborator {

    @Id
    private int collaboratorId;
    private String collaboratorName;
    private String collaboratorEmail;
}
