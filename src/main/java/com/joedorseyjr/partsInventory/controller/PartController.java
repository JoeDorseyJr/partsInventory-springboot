package com.joedorseyjr.partsInventory.controller;

import com.joedorseyjr.partsInventory.entity.Part;
import com.joedorseyjr.partsInventory.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api") // http://localhost:8080/api - Starting point
public class PartController {

    private final PartService partService;

    @Autowired
    public PartController(@Qualifier("partServiceIMPL")PartService partService) {
        this.partService = partService;
    }

    //GET Requests
    @GetMapping("/showAll") // http://localhost:8080/api/showAll
    public List<Part> findAll(){
        return partService.findAll();
    }

    //POST Requests
    @PostMapping("/addPart") // http://localhost:8080/api/addPart
    public Part addPart(@RequestBody Part part){
        part.setId(0L);
        partService.saveOrUpdate(part);
        return part;
    }

    //PUT Requests
    @PutMapping("/updatePart") // http://localhost:8080/api/updatePart
    public Part updatePart(@RequestBody Part part){
        partService.saveOrUpdate(part);
        return part;
    }

    //DELETE Requests
    @DeleteMapping("/removePart/{id}")
    public String deletePart(@PathVariable Long id){
        Part part = (Part) partService.findById(id);
            partService.deleteById(id);
            return "Removed part no.:" + part.toString();
    }


}
