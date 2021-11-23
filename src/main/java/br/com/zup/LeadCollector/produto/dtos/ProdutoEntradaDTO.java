package br.com.zup.LeadCollector.produto.dtos;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class ProdutoEntradaDTO {

  @NotBlank
  @Min(2)
  private String nome;

  public ProdutoEntradaDTO() {

  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

}
