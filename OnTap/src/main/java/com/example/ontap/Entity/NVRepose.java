package com.example.ontap.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NVRepose {
    @Id
    private Integer id;
    private String ma;
    private String hoTen;
    private String gioiTinh;
    private String diaChi;
    private String tenChucVu;
}
