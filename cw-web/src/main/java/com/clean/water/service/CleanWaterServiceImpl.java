package com.clean.water.service;

import com.clean.water.dto.CleanWaterResponse;
import com.clean.water.entity.CleanWater;
import com.clean.water.repo.CleanWaterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CleanWaterServiceImpl implements CleanWaterService {

    private final CleanWaterRepository cleanWaterRepository;

    @Override
    public List<CleanWaterResponse> getCleanWaterList() {
        return cleanWaterRepository.findAll()
                .stream()
                .map(CleanWater::toCleanWaterResponse)
                .collect(Collectors.toList());
    }
}
