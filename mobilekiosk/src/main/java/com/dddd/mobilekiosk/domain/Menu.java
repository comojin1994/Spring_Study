package com.dddd.mobilekiosk.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@NoArgsConstructor
@Where(clause = "deleted = false")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @NotEmpty
    private Long storeID;

    @NonNull
    @NotEmpty
    private String name;

    @NonNull
    @NotEmpty
    @Min(1)
    private int price;

    @NonNull
    @NotEmpty
    private String picture;

    private String category;

    private String detail;

    @ColumnDefault("0")
    private boolean deleted;
}
