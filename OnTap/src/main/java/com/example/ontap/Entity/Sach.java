package com.example.ontap.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sach")
public class Sach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ten;
    private  String ma;

    private Integer soTrang;
    private Double donGia;
   @ManyToOne
    @JoinColumn(name = "id_nxb")
    private NXB nxb;
}
