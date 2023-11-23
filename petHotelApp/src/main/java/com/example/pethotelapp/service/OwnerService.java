package com.example.pethotelapp.service;

import com.example.pethotelapp.dto.OwnerDto;
import com.example.pethotelapp.mapper.OwnerMapper;
import com.example.pethotelapp.model.OwnerModel;
import com.example.pethotelapp.repository.OwnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OwnerService {
    private final OwnerRepository ownerRepository;

    public OwnerDto addOwner(OwnerDto ownerDto){
        OwnerModel ownerModel = OwnerMapper.toOwnerModel(ownerDto);
        OwnerModel addOwner = ownerRepository.save(ownerModel);
        return OwnerMapper.toOwnerDto(addOwner);
    }
}
