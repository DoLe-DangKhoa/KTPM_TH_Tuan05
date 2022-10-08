package com.example.springdatajpa_th04.repository;


import com.example.springdatajpa_th04.entity.MayBay;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface MayBayRepository extends CrudRepository<MayBay, Integer> {
    @Query("select mb.loai from MayBay mb where mb.tamBay > 10000")
    List<String> findLoaiMayBayByTamBay();

    @Query("select count(mb) from MayBay mb where mb.loai like 'Boeing%'")
    int findLoaiMayBay();

    @Query(value = "select mb.maMB from ChungNhan cn, MayBay mb, NhanVien nv " +
            "where nv.maNV = cn.MaNV and mb.maMB = cn.MaMB and nv.ten like ?1", nativeQuery = true)
    List<Integer> getMaByTenNV(String hoNV);

    @Query("select mb.loai from MayBay mb " +
            "where mb.tamBay >= (select cb.doDai from ChuyenBay cb where cb.maCB = 'VN280')")
    List<String> loaiMayBayChuyenVN280();

    @Query(value = "select cn.MaMB as maMB, mb.loai as loai, count(cn.MaNV) as TongPhiCong " +
            "from MayBay mb, ChungNhan cn " +
            "where mb.maMB = cn.MaMB " +
            "group by cn.MaMB", nativeQuery = true)
    List<Object> demSoPhiCongLaiMayBay();
}
