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
public class Channel {

    @Id
    private int channelId;
    private String channelName;
    private int adminId;
}
