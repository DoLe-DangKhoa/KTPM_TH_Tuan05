package com.example.springdatajpa_th04.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Time;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "chuyenbay")
public class ChuyenBay implements Serializable {
    @Id
    @Column(name = "maCB")
    public String maCB;
    @Column(name = "gadi")
    public String gaDi;
    @Column(name = "gaden")
    public String gaDen;
    @Column(name = "dodai")
    public int doDai;
    @Column(name = "giodi")
    public Time gioDi;
    @Column(name = "gioden")
    public Time gioDen;
    @Column(name = "chiphi")
    public int chiPhi;

}
