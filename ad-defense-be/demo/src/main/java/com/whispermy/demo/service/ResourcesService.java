package com.whispermy.demo.service;

import com.whispermy.demo.domain.entity.Resources;
import com.whispermy.demo.domain.entity.Role;

import java.util.List;

public interface ResourcesService {

    Resources selectResources(long id);

    List<Resources> selectResources();

    void insertResources(Resources Resources);

    void deleteResources(long id);
}