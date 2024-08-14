package com.example.ontap.Repository;

import com.example.ontap.Entity.NXB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface nxbRepository extends JpaRepository<NXB,Integer> {
}
