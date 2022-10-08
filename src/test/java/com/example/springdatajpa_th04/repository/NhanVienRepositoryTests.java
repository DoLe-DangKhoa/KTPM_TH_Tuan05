package com.example.springdatajpa_th04.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NhanVienRepositoryTests {
    @Autowired
    private NhanVienRepository nhanVienRepository;
    @Test
    void cau3(){
        System.out.println(nhanVienRepository.findNhanVienByLuong());
    }
    @Test
    void cau8(){
        System.out.println("Tổng lương phải trả cho nhân viên: " + nhanVienRepository.tinhTongLuong());
    }
    @Test
    void cau9(){
        System.out.println(nhanVienRepository.getMaByLoaiMayBay());
    }
    @Test
    void cau10(){
        System.out.println(nhanVienRepository.findNhanVienByMaMB(747));
    }
    @Test
    void cau12(){
        System.out.println(nhanVienRepository.getMaByLoaiMB());
    }

    @Test
    void cau15(){
        System.out.println(nhanVienRepository.findTenNhanVienLaiBoeing());
    }
    @Test
    void cau22(){
        System.out.println(nhanVienRepository.findMaPhiCongLai3LoaiMayBay());
    }

}
