package com.example.springdatajpa_th04.entity;

import jdk.jfr.Enabled;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Enabled
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "chungnhan")
@IdClass(ChungNhanPK.class)
public class ChungNhan implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "manv", columnDefinition = "varchar(10)")
    public NhanVien MaNV;

    @Id
    @ManyToOne
    @JoinColumn(name = "mamb", columnDefinition = "int")
    public MayBay MaMB;
}
