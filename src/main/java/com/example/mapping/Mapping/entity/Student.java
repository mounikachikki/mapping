package com.example.mapping.Mapping.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "student")
public class Student {
    public Student(String sname, Long age) {
        this.sname = sname;
        this.age = age;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sid;

     @Column(name = "sname")
     private String sname;

     @Column(name = "age")
     private Long age;

     @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
     @JoinColumn(name = "b_id")
     private Book book;

}
