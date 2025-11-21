package org.ftech.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "person")
public class Person {
    @Id
    @Column(name = "id", length = 40)
    private String id;

    @Column(name = "code", length = 20)
    private String code;

    @Column(name = "name", length = 500, nullable = false)
    private String name;

    @Column(name = "short_name", length = 30)
    private String shortName;

    @Column(name = "activated", nullable = false)
    private Boolean activated;

    @Column(name = "gender", length = 50)
    private String gender;

    @Column(name = "dob")
    private LocalDate dob;

    @Column(name = "email")
    private String email;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "job_title", length = 50)
    private String jobTitle;

    @Column(name = "address", length = 500)
    private String address;

    @Column(name = "description", length = 2000)
    private String description;

    @Column(name = "is_admin")
    private Boolean isAdmin;

    @Column(name = "created_by", length = 40)
    private String createdBy;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "updated_by", length = 40)
    private String updatedBy;

    @Column(name = "updated_date")
    private LocalDateTime updatedDate;
}
