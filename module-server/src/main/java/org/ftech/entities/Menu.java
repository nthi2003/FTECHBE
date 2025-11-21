package org.ftech.entities;
import entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Menu")
@EqualsAndHashCode(callSuper = true)
public class Menu extends BaseEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name = "id")
    private UUID id;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "code", length = 50)
    private String code;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "app_code", length = 50)
    private String appCode;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "name", length = 500)
    private String name;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "name_en", length = 500)
    private String nameEn;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "status", length = 2)
    private String status;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "parent_code", length = 50)
    private String parentCode;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "order_index")
    private Integer OrderIndex;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "url", length = 500)
    private String url;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "include_menu", length = 1)
    private String includeMenu;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "module_type", length = 1)
    private String moduleType;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "path_folder", length = 200)
    private String pathFolder;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "menu_type")
    private Short menuType;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "is_public")
    private Boolean isPublic;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "icon")
    private String icon;
}
