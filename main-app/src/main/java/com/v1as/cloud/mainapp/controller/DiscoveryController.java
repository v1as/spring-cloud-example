package com.v1as.cloud.mainapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/discover")
public class DiscoveryController {

    private final DiscoveryClient discoveryClient;

    @Autowired
    public DiscoveryController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("")
    public List<String> getServices() {
        return discoveryClient.getServices();
    }

    @GetMapping("/{serviceId}")
    public List<ServiceInstance> getServices(@PathVariable String serviceId) {
        return discoveryClient.getInstances(serviceId);
    }

}
