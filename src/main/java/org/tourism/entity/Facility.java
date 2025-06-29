package org.tourism.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.locationtech.jts.geom.Point;
import org.tourism.constant.FacilityType;

@Data
@Entity
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private FacilityType facilityType;

    @Column(columnDefinition = "geography(Point,4326)")
    private Point location;

    private String businessMan; // keycloak foreign kye



}
