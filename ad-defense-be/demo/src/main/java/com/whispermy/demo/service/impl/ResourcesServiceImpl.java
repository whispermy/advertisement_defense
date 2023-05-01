package com.whispermy.demo.service.impl;

import com.whispermy.demo.domain.entity.Resources;
import com.whispermy.demo.domain.entity.Role;
import com.whispermy.demo.repository.ResourcesRepository;
import com.whispermy.demo.service.ResourcesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Slf4j
@Service
public class ResourcesServiceImpl implements ResourcesService {

    @Autowired
    private ResourcesRepository ResourcesRepository;

    @Transactional
    public Resources selectResources(long id) {
        return ResourcesRepository.findById(id).orElse(new Resources());
    }

    @Transactional
    public List<Resources> selectResources() {
        return ResourcesRepository.findAll();
    }

    @Transactional
    public void insertResources(Resources resources){
        ResourcesRepository.save(resources);
    }

    @Transactional
    public void deleteResources(long id) {
        ResourcesRepository.deleteById(id);
    }
}