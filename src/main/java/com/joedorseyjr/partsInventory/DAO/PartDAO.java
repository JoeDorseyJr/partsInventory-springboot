package com.joedorseyjr.partsInventory.DAO;

import com.joedorseyjr.partsInventory.entity.Part;

import java.util.List;

public interface PartDAO {
    List<Part> findAll();
    Object findById(Long id);
    void saveOrUpdate(Part part);
    void deleteById(Long id);
}
