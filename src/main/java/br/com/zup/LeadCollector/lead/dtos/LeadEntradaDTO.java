package br.com.zup.LeadCollector.lead.dtos;

import br.com.zup.LeadCollector.produto.Produto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.List;

public class LeadEntradaDTO {

  @Email
  @NotBlank
  private String email;
  @NotBlank
  @Min(2)
  private String nome;
  private List<Produto> produtos;

  public LeadEntradaDTO() {

  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Produto> getProdutos() {
    return produtos;
  }

  public void setProdutos(List<Produto> produtos) {
    this.produtos = produtos;
  }
}
