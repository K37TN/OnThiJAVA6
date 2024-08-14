package com.example.ontap.Repository;

import com.example.ontap.Entity.NVRepose;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface NhanVienRepose extends JpaRepository<NVRepose,Integer> {
    @Query(
            value = "SELECT nv.id, nv.ma, CONCAT(nv.ho, ' ', nv.ten_dem, ' ', nv.ten) AS ho_ten,nv.gioi_tinh, nv.dia_chi,\n" +
                    "cv.ten AS ten_chuc_vu FROM nhan_vien nv INNER JOIN chuc_vu cv ON nv.id_cv = cv.id",nativeQuery = true
    )
    Page<NVRepose> getNV(Pageable pageable);
}
