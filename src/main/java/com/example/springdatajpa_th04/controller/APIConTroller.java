package com.example.springdatajpa_th04.controller;

import com.example.springdatajpa_th04.entity.ChuyenBay;
import com.example.springdatajpa_th04.entity.NhanVien;
import com.example.springdatajpa_th04.repository.ChuyenBayRepository;
import com.example.springdatajpa_th04.repository.MayBayRepository;
import com.example.springdatajpa_th04.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class APIConTroller {
    @Autowired
    ChuyenBayRepository chuyenBayRepository;
    @Autowired
    NhanVienRepository nhanVienRepository;
    @Autowired
    MayBayRepository mayBayRepository;

    //Cau 1
    @RequestMapping(value = "/chuyenbaygadenthoayeucau/{gaden}", method = RequestMethod.GET)
    public List<ChuyenBay> timChuyenBayBoiGaDen(@PathVariable("gaden") String gaDen){
        List<ChuyenBay> chuyenBays = chuyenBayRepository.findChuyenBayByGaDen(gaDen);
        if(chuyenBays == null){
            ResponseEntity.notFound().build();
        }
        return chuyenBays;
    }
    //Cau 2
    @RequestMapping(value = "/maybaycotambayhon10000", method = RequestMethod.GET)
    public List<String> mayBayCoTamBayLonHon10000(){
        List<String> mayBays = mayBayRepository.findLoaiMayBayByTamBay();
        if(mayBays == null){
            ResponseEntity.notFound().build();
        }
        return mayBays;
    }
    //Cau 3
    @RequestMapping(value = "/timnhanvientheoluong", method = RequestMethod.GET)
    public List<NhanVien> timNhanVienTheoLuong(){
        List<NhanVien> nhanViens = nhanVienRepository.findNhanVienByLuong();
        if(nhanViens == null){
            ResponseEntity.notFound().build();
        }
        return nhanViens;
    }
    //Cau 4
    @RequestMapping(value = "/timchuyenbayboidodai", method = RequestMethod.GET)
    public List<ChuyenBay> timChuyenBayBoiDoDai(){
        List<ChuyenBay> chuyenBays = chuyenBayRepository.findChuyenBayByDoDai();
        if(chuyenBays == null){
            ResponseEntity.notFound().build();
        }
        return chuyenBays;
    }
    //Cau 5
    @RequestMapping(value = "/timchuyenbayboigadenvagadi", method = RequestMethod.GET)
    public List<ChuyenBay> timChuyenBayBoiGaDenVaGaDi(){
        List<ChuyenBay> chuyenBays = chuyenBayRepository.findChuyenBayByGaDiVaGaDen();
        if(chuyenBays == null){
            ResponseEntity.notFound().build();
        }
        return chuyenBays;
    }
    //Cau 6
    @RequestMapping(value = "/sochuyenbayxuatphattusaigon/{gaDi}", method = RequestMethod.GET)
    public String soChuyenBayXuatPhatTuSaiGon(@PathVariable("gaDi") String gaDi){
        int soChuyenBay = chuyenBayRepository.findChuyenBayByGaDi();
        if(soChuyenBay == 0){
            ResponseEntity.notFound().build();
        }
        return  "Có " + soChuyenBay + " chuyến bay xuất phát từ Sài Gòn";
    }
    //Cau 7
    @RequestMapping(value = "/soloaimaybayboeing", method = RequestMethod.GET)
    public String soLoaiMayBayBoeing(){
        int soLoaiMayBay = mayBayRepository.findLoaiMayBay();
        if(soLoaiMayBay == 0){
            ResponseEntity.notFound().build();
        }
        return  "Có " + soLoaiMayBay + " loại máy bay Boeing";
    }
    //Cau 8
    @RequestMapping(value = "/tongsoluongnhanvien", method = RequestMethod.GET)
    public String tongSoLuongNhanVien(){
        int soLuong = nhanVienRepository.tinhTongLuong();
        if(soLuong == 0){
            ResponseEntity.notFound().build();
        }
        return  "Tổng số lương phải trả cho các nhân viên là " + soLuong;
    }
    //Cau 9
    @RequestMapping(value = "/manhanvienlaimaybayboeing", method = RequestMethod.GET)
    public List<String> maNhanVienLaiMayBayBoeing(){
        List<String> maNhanViens = nhanVienRepository.getMaByLoaiMayBay();
        if(maNhanViens == null){
            ResponseEntity.notFound().build();
        }
        return  maNhanViens;
    }
    //Cau 10
    @RequestMapping(value = "/nhanvienlaimaybay747/{maMB}", method = RequestMethod.GET)
    public List<NhanVien> nhanVienLaiMayBay747(@PathVariable("maMB") int maMB){
        List<NhanVien> nhanViens = nhanVienRepository.findNhanVienByMaMB(maMB);
        if(nhanViens == null){
            ResponseEntity.notFound().build();
        }
        return  nhanViens;
    }
    //Cau 11
    @RequestMapping(value = "/timmamaybaytheoho/{hoNV}", method = RequestMethod.GET)
    public List<Integer> nhanVienLaiMayBay747(@PathVariable("hoNV") String hoNV){
        List<Integer> maMayBays = mayBayRepository.getMaByTenNV(hoNV);
        if(maMayBays == null){
            ResponseEntity.notFound().build();
        }
        return  maMayBays;
    }
    //Cau 12
    @RequestMapping(value = "/maphicongvualaiboeingvaairbus", method = RequestMethod.GET)
    public List<String> maPhiCongVuaLaiBoeingVuaLaiAirbus(){
        List<String> maPhiCongs = nhanVienRepository.getMaByLoaiMB();
        if(maPhiCongs == null){
            ResponseEntity.notFound().build();
        }
        return  maPhiCongs;
    }

    //Cau 15
    @RequestMapping(value = "/phiconglaimaybayboeing", method = RequestMethod.GET)
    public List<String> phiCongLaiMayBayBoeing(){
        List<String> tenPhiCongs = nhanVienRepository.findTenNhanVienLaiBoeing();
        if(tenPhiCongs == null){
            ResponseEntity.notFound().build();
        }
        return  tenPhiCongs;
    }


    //Cau 20
    @RequestMapping(value = "/chuyenbaykhoihanhtruoc12h", method = RequestMethod.GET)
    public List<ChuyenBay> chuyenBayKhoiHanhTruoc12h(){
        List<ChuyenBay> chuyenBays = chuyenBayRepository.findChuyenBayKhoiHanhTruoc12h();
        if(chuyenBays == null){
            ResponseEntity.notFound().build();
        }
        return  chuyenBays;
    }

    //Cau 22
    @RequestMapping(value = "/timphicongchilaibaloaimaybay", method = RequestMethod.GET)
    public List<String> timPhiCongChiLai3LoaiMB(){
        List<String> maPhiCongs = nhanVienRepository.findMaPhiCongLai3LoaiMayBay();
        if(maPhiCongs == null){
            ResponseEntity.notFound().build();
        }
        return  maPhiCongs;
    }


}
