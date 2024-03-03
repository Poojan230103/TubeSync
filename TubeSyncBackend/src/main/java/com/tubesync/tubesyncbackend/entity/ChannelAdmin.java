package com.tubesync.tubesyncbackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ChannelAdmin {

    @Id
    private int adminId;
    private String adminName;
    private String adminEmail;
}
