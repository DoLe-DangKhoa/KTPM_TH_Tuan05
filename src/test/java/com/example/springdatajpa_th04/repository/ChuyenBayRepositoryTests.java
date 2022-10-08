package com.example.springdatajpa_th04.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ChuyenBayRepositoryTests {
    @Autowired
    ChuyenBayRepository chuyenBayRepository;
    @Test
    void cau1(){
        System.out.println(chuyenBayRepository.findChuyenBayByGaDen("DAD"));
    }

    @Test
    void cau4(){
        System.out.println(chuyenBayRepository.findChuyenBayByDoDai());
    }

    @Test
    void cau5(){
        System.out.println(chuyenBayRepository.findChuyenBayByGaDiVaGaDen());
    }

    @Test
    void cau6(){
        System.out.println("Có " + chuyenBayRepository.findChuyenBayByGaDi() + " chuyến bay xuất phát từ Sài Gòn");
    }

    @Test
    void cau14(){
        System.out.print(chuyenBayRepository.findChuyenBayByMayBayAirbusA320());
    }

    @Test
    void cau20(){
        System.out.print(chuyenBayRepository.findChuyenBayKhoiHanhTruoc12h());
    }


    //Cau 21 select y het 20 nen bo qua
    @Test
    void cau21(){
        System.out.print(chuyenBayRepository.demChuyenBayKhoiHanhTruoc12h());
    }
    @Test
    void cau17(){
        System.out.print(chuyenBayRepository.findChuyenBayDapUngYeuCau());
    }

    @Test
    void cau18(){
        System.out.print(chuyenBayRepository.CountChuyenBayKhoiHanhCungGa());
    }
}
