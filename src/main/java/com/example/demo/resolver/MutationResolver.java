package com.example.demo.resolver;

import com.example.demo.entity.Cat;
import com.example.demo.service.CatService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MutationResolver implements GraphQLMutationResolver {
    @Autowired
    private CatService catService;

    //create cat api (CREATE)
    public Cat saveCat(Cat cat){
        catService.saveNewCat(cat);

        return cat;
    }

    //update cat api (UPDATE)
    public Cat updateCat(Cat catToUpdate) throws Exception {
        Cat c = catService.findCat(catToUpdate.getId());
        c.setNickName(catToUpdate.getNickName());
        c.setColor(catToUpdate.getColor());
        c.setAge(catToUpdate.getAge());

        catService.saveNewCat(c);

        return c;
    }

    //remove cat api (DELETE)
    public boolean removeCat(int id){
        catService.deleteCat(id);

        return true;
    }

    /*
    public Cat saveCat(int id, String name, String color, int age){
        Cat c = new Cat(id, name, color, age);
        catService.saveNewCat(c);

        return c;
    }

    public String testMutation(){
        return "mutation test...";
    }
    */

}
