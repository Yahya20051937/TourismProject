package org.tourism.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.tourism.constant.EmergencyType;
import org.locationtech.jts.geom.Point;

@Entity
@Data
public class Emergencies{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "geography(Point,4326)")
    private Point location;

    EmergencyType emergencyType;


}
