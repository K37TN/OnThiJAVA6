package com.example.ontap.Repository;

import com.example.ontap.Entity.NhanVien;
import com.example.ontap.Entity.Sach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NhanVienRepository extends JpaRepository<NhanVien,Integer> {


}
