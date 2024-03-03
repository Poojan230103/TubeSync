package com.tubesync.tubesyncbackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class VideoMetaData {

    @Id
    private int videoId;
    private String videoUrl;
    private int collaboratorId;
    private int channelId;
    private Date videoAddedAt;
    private boolean isUploadedToYouTube;
}
