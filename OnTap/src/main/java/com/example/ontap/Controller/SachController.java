package com.example.ontap.Controller;

import com.example.ontap.Entity.Sach;
import com.example.ontap.Repository.sachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SachController {
    @Autowired
    sachRepository repository;

    @GetMapping("/hienthi")
    public List<Sach> hienthi(){
        return repository.findAll();
    }
}
