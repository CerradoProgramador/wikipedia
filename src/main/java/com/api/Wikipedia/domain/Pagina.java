package com.api.Wikipedia.domain;

import com.api.Wikipedia.domain.cabecalho.Cabecalho;
import com.api.Wikipedia.domain.conteudo.Conteudo;
import com.api.Wikipedia.domain.conteudoLateral.ConteudoLateral;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Pagina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Cabecalho Cabecalho;
    @OneToMany
    private List<Conteudo> conteudo;
    @OneToOne
    private ConteudoLateral conteudoLateral;
}
