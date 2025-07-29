package com.api.Wikipedia.domain.conteudoLateral;

import com.api.Wikipedia.domain.conteudo.Paragrafo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Subtitulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    @ManyToMany
    private List<Paragrafo> paragrafo;

}
