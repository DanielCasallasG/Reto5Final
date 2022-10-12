/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.Interface.SkateInterface;
import com.example.demo.Modelo.Skate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



/**
 *
 * @author danielcasallas
 */
@Repository
public class SkateRepository {
   
       @Autowired
    private SkateInterface extencionesCrud;
    
    public List<Skate> getAll(){
        return (List<Skate>) extencionesCrud.findAll();
    }
    
    public Optional<Skate> getSkate(int id){
        return extencionesCrud.findById(id);
    }
    
    public Skate save(Skate skate){
        return extencionesCrud.save(skate);
    }
    public void delete(Skate skate){
        extencionesCrud.delete(skate);
    }
}
