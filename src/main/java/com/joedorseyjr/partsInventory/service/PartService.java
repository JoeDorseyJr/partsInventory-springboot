package com.joedorseyjr.partsInventory.service;

import com.joedorseyjr.partsInventory.entity.Part;

import java.util.List;

public interface PartService {
    List<Part> findAll();
    Object findById(Long id);
    void saveOrUpdate(Part part);
    void deleteById(Long id);
}
