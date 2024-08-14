package com.example.ontap.Controller;

import com.example.ontap.Entity.NVRepose;
import com.example.ontap.Entity.NhanVien;
import com.example.ontap.Repository.NhanVienRepose;
import com.example.ontap.Repository.NhanVienRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NhanVienController {
    @Autowired
    NhanVienRepository repository;
    @Autowired
    NhanVienRepose nhanVienRepose;

    @GetMapping("/showNhanVien")
    public List<NhanVien> getAll(){
     return    repository.findAll();
    }

    @GetMapping("/List")
    public Page<NVRepose> finall(Pageable pageable){
        return nhanVienRepose.getNV(pageable);
    }
}
