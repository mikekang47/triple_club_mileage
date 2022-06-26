package com.sihookang.triple_club_mileage.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "REVIEW")
public class Review {
    @Id
    @Column(name = "REVIEW_ID", nullable = false)
    private UUID id;

    @Column(name = "CONTENT")
    private String content;

    @ManyToOne
    @JoinColumn(name = "PLACE_ID", insertable = false, updatable = false)
    private Place place;
}
