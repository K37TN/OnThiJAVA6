package com.example.ontap.Controller;

import com.example.ontap.Entity.Sach;
import com.example.ontap.Entity.SachRepose;
import com.example.ontap.Repository.SacchRepose;
import com.example.ontap.Repository.sachRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class SachController {
    @Autowired
    sachRepository repository;
    @Autowired
    SacchRepose sacchRepose;

    @GetMapping("/hienthi2")
    public List<Sach> hienthi(){
        return repository.findAll();
    }
    @GetMapping("/hienthi3")
    public Page<SachRepose> getAll(Pageable pageable){
        return sacchRepose.getAll(pageable);
    }
}
