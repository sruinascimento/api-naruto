package br.com.apinaruto.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroPersonagem (
        @NotBlank
        String nome,
        @NotBlank
        String cla,
        @NotBlank
        String estilo,
        @NotBlank
        String patente,
        @NotBlank
        String avatar,
        @NotNull
        Integer idade
        ) {
}
