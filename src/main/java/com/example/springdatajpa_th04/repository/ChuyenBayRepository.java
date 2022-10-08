package com.example.springdatajpa_th04.repository;


import com.example.springdatajpa_th04.entity.ChuyenBay;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ChuyenBayRepository extends CrudRepository<ChuyenBay, String> {
    @Query("select cb from ChuyenBay cb where cb.gaDen = ?1")
    List<ChuyenBay> findChuyenBayByGaDen(String gaDen);

    @Query("select cb from ChuyenBay cb where cb.doDai between 8000 and 10000")
    List<ChuyenBay> findChuyenBayByDoDai();

    @Query("select cb from ChuyenBay cb where cb.gaDi = 'SGN' and cb.gaDen = 'BMV'")
    List<ChuyenBay> findChuyenBayByGaDiVaGaDen();

    @Query("select count(cb) from ChuyenBay cb where cb.gaDi = 'SGN'")
    int findChuyenBayByGaDi();

    @Query("select cb from ChuyenBay cb " +
            "where cb.doDai <= (select mb.tamBay from MayBay mb where mb.loai = 'Airbus A320')")
    List<ChuyenBay> findChuyenBayByMayBayAirbusA320();

    @Query("select cb from ChuyenBay cb " +
            "where cb.gioDi < Time('12:00')")
    List<ChuyenBay> findChuyenBayKhoiHanhTruoc12h();
    @Query("select cb, count(cb.maCB) as TongChuyenBay from ChuyenBay cb " +
            "where cb.gioDi < Time('12:00') " +
            "group by cb.gaDi")
    List<Object> demChuyenBayKhoiHanhTruoc12h();

    @Query("select cb1 from ChuyenBay cb1,ChuyenBay cb2 where cb1.gaDen=cb2.gaDi and cb1.gaDi = cb2.gaDen")
    List<Object> findChuyenBayDapUngYeuCau();

    @Query("select count(cb.maCB) from ChuyenBay cb where cb.gaDi = 'HAN' ")
    int CountChuyenBayKhoiHanhCungGa();
}
