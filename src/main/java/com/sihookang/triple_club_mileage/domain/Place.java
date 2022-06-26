package com.sihookang.triple_club_mileage.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "PLACE")
public class Place {
    @Id
    @Column(name = "PLACE_ID", nullable = false)
    private UUID id;

    @OneToMany(mappedBy = "place")
    private List<Review> reviewList = new ArrayList<>();

}
