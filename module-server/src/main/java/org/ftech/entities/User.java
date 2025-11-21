package org.ftech.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "User")
public class User {
    @Id
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "user_name", length = 40, nullable = false)
    private String userName;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "name", length = 500)
    private String name;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "pword", length = 50)
    private String pword;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "status")
    private Integer status;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "reset_key", length = 20)
    private String resetKey;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "reset_date")
    private LocalDateTime resetDate;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "person_id")
    private String personId;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "created_by", length = 40, nullable = false)
    private String createdBy;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "created_date", nullable = false)
    private LocalDateTime createdDate;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "updated_by", length = 40)
    private String updatedBy;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Person person;
}
