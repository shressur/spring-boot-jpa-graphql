package com.example.demo.service;

import com.example.demo.entity.Cat;
import com.example.demo.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatService {
    @Autowired
    private CatRepository catRepository;

    //list of cats
    public List<Cat> findAllCats(){
        return catRepository.findAll();
    }

    //single cat
    public Cat findCat(int id) throws Exception {
        Optional<Cat> c = catRepository.findById(id);
        if(c.isEmpty()){
            throw new Exception("Cat not found");
        }
        return c.get();
    }

    //create cat
    public Cat saveNewCat(Cat newCat) {
        return catRepository.save(newCat);
    }

    //remove cat
    public void deleteCat(int id){
        catRepository.deleteById(id);
    }
}
