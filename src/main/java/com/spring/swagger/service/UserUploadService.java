package com.spring.swagger.service;

import com.spring.swagger.entity.User;
import com.spring.swagger.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserUploadService {


    @Autowired
    private UserRepository repo;



    public User saveRegister(User user, String email, String password){
        return repo.save(user);
    }

   /* public User save(User user, String description, String category){
        return repo.save(user);
    }*/
    public User save(User user,String description, String category ){
        return repo.save(user);
    }


    public List<User> viewAll() {
        return (List<User>) repo.findAll();
    }

    public List<User> getAllImages(){
        return (List<User>) repo.findAll();
    }




    public void deleteImageById(Integer id) {
        repo.deleteById(id);
    }

}
