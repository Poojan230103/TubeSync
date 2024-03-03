package com.tubesync.tubesyncbackend.controller;

import com.tubesync.tubesyncbackend.service.ChannelAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChannelAdmin {

    private ChannelAdminService channelAdminService;

    @Autowired
    public ChannelAdmin(ChannelAdminService channelAdminService) {
        this.channelAdminService = channelAdminService;
    }

    @GetMapping("/admin/{adminId}/home")
    public List<String> getVideosWithPendingApproval(@PathVariable String adminId) {
        channelAdminService.getVideosWithPendingApproval(adminId);
    }

}
