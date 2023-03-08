package com.clean.water.controller;


import com.clean.water.dto.CleanWaterResponse;
import com.clean.water.service.CleanWaterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clean-water")
@RequiredArgsConstructor
public class CleanWaterController {

    private final CleanWaterService cleanWaterService;

    @GetMapping("/infos")
    public List<CleanWaterResponse> cleanWaterResponse() {

        return cleanWaterService.getCleanWaterList();
    }
}
