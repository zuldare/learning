package jj.hernandez.learning.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "athletes")
@Data
public class Athlete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "birth_year")
    private String birthYear;

}