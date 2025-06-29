package org.tourism.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private float price;

    @OneToMany
    @JoinColumn(name = "facility_id")
    private Facility facility;
}
