package br.com.zup.LeadCollector.lead;

import br.com.zup.LeadCollector.produto.Produto;
import br.com.zup.LeadCollector.produto.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeadService {
  @Autowired
  private LeadRepository leadRepository;

  public Lead salvarLead(Lead lead) {
    verificarEmail(lead);
    return leadRepository.save(lead);
  }

  public void verificarEmail(Lead novoLead) {
    Lead lead = new Lead();
    if (novoLead.getEmail().equalsIgnoreCase(lead.getEmail())) {
      throw new RuntimeException();
    }
  }

}
