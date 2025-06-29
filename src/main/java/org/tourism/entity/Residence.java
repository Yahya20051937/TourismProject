package org.tourism.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.locationtech.jts.geom.Point;
import org.tourism.constant.ResidenceType;

@Data
@Entity
public class Residence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private ResidenceType type;

    @Column(columnDefinition = "geography(Point,4326)")
    private Point location;

    private String businessMan;  // keycloak foreign key
}
