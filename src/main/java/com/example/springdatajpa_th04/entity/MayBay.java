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
@Table(name = "maybay")
public class MayBay implements Serializable {
    @Id
    @Column(name = "mamb")
    public int maMB;

    @Column(name = "loai")
    public String loai;

    @Column(name = "tambay", updatable = false)
    public int tamBay;
}
