package com.example.ontap.Controller;

import com.example.ontap.Entity.NhanVien;
import com.example.ontap.Entity.Sach;
import com.example.ontap.Entity.SachRepose;
import com.example.ontap.Repository.SacchRepose;
import com.example.ontap.Repository.sachRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

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
    @PostMapping("/add")
    public ResponseEntity Add(@RequestBody Sach sach){
        Sach save = repository.save(sach);
        return ResponseEntity.ok(save);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        repository.deleteById(id);
        return "xoa thanh cong";
    }
    @GetMapping("/detail/{id}")
    public ResponseEntity<Sach> showdetail(@PathVariable Integer id){
      Optional<Sach> detail = repository.findById(id);
      return ResponseEntity.ok(detail.get());
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Sach> updateNV(@PathVariable Integer id, @RequestBody Sach sach) {
        Optional<Sach> update = repository.findById(id);
        if (update.isPresent()) {
            Sach sach1 = update.get();
            sach1.setMa(sach.getMa());
            sach1.setTen(sach.getTen());
            sach1.setDonGia(sach.getDonGia());
            sach1.setSoTrang(sach.getSoTrang());
            sach1.setNxb(sach.getNxb());

            repository.save(sach1);
            return ResponseEntity.ok(sach1);
        }
        return ResponseEntity.notFound().build();
    }
}
