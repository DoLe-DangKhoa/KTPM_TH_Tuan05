package com.example.springdatajpa_th04.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "nhanvien")
public class NhanVien implements Serializable {
    @Id
    @Column(name = "manv")
    public String maNV;

    @Column(name = "ten")
    public String ten;

    @Column(name = "luong")
    public int luong;
}
