package com.herbalife.is.webmvndemo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orderheader")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderHeaderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String code;
    private Integer quantity;

    @Builder.Default
    @Column(name = "createdon")
    private LocalDateTime createdOn = LocalDateTime.now();

    @Builder.Default
    @Column( name = "updatedon")
    private LocalDateTime updatedOn = LocalDateTime.now();
}
