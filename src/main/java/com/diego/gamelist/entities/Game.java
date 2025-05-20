package com.diego.gamelist.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity
@Table(name = "tb_game")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    private String title;
    @Column(name = "game_year")
    private Integer year;
    private String genre;
    private String platforms;
    private double score;
    private String imgUrl;
    @Column(columnDefinition = "TEXT")
    private String shortDescription;
    @Column(columnDefinition = "TEXT")
    private String longDescription;





}
