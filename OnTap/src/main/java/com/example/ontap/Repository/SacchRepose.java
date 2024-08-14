package com.example.ontap.Repository;

import com.example.ontap.Entity.SachRepose;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SacchRepose extends JpaRepository<SachRepose,Integer> {
    @Query(
value = "select s.id,s.ma,s.ten,s.so_trang,s.don_gia,xb.ten AS TenNXB  from sach s Inner Join  nxb xb on s.id_nxb = xb.id ",nativeQuery = true
    )
    Page<SachRepose> getAll(Pageable pageable);
}
