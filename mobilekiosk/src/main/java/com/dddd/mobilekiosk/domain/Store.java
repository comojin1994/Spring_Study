package com.dddd.mobilekiosk.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Where;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@Where(clause = "deleted = false")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @NotEmpty
    private String name;

    @NonNull
    @NotEmpty
    private String phoneNumber;

    @NonNull
    @NotEmpty
    private String qrCode;

    @ColumnDefault("0")
    private boolean deleted;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Menu> menu;
}
