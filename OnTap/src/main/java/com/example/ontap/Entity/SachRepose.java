package com.example.ontap.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
public class SachRepose {
    @Id
    private Integer id;
    private String ten;
    private  String ma;
    private Integer soTrang;
    private Double donGia;
    private String tenNXB;
}
