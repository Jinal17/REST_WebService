package com.swe645.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "STUDENT_FORM")
public class Student {

    @Id
    @GeneratedValue
    private int id;
    @Column(name="student_id")
    private String studentId;
    @Column(name="username")
    private String name;
    @Column(name="address")
    private String address;
    @Column(name="city")
    private String city;
    @Column(name="state")
    private String state;
    @Column(name="zip")
    private String zip;
    @Column(name="phone_num")
    private String phoneNum;
    @Column(name="email")
    private String email;
    @Column(name="grad_month")
    private String gradMonth;
    @Column(name="grad_year")
    private String gradYear;
    @Column(name="likes")
    private String likes;
    @Column(name="interests")
    private String interests;
    @Column(name="comments")
    private String comments;
    @Column(name="recommendation")
    private String recommendation;
}
