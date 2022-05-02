package com.example.demo.resolver;

import com.example.demo.entity.Cat;
import com.example.demo.service.CatService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class QueryResolver implements GraphQLQueryResolver {

    @Autowired
    private CatService catService;

    //test api
    public String testingApp(){
        return "Test in progress...";
    }

    //get all cats api (READ)
    public List<Cat> getAllCats(){
        return catService.findAllCats();
    }

    //single cat api (READ)
    public Cat getCat(int id) throws Exception {
        return catService.findCat(id);
    }


}
