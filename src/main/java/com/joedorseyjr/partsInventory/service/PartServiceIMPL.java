package com.joedorseyjr.partsInventory.service;

import com.joedorseyjr.partsInventory.DAO.PartDAO;
import com.joedorseyjr.partsInventory.entity.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartServiceIMPL implements PartService{
    private final PartDAO partDAO;

    @Autowired
    public PartServiceIMPL( PartDAO partDAO) {
        this.partDAO = partDAO;
    }

    @Override
    public List<Part> findAll() {
        return partDAO.findAll();
    }

    @Override
    public Object findById(Long id) {
        return partDAO.findById(id);
    }

    @Override
    public void saveOrUpdate(Part part) {
        partDAO.saveOrUpdate(part);
    }

    @Override
    public void deleteById(Long id) {
        partDAO.deleteById(id);
    }
}
