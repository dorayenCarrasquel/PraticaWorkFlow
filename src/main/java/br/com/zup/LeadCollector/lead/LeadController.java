package br.com.zup.LeadCollector.lead;

import br.com.zup.LeadCollector.lead.Lead;
import br.com.zup.LeadCollector.lead.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leads")
public class LeadController {
    @Autowired
    private LeadService leadService;

    @PutMapping
    public Lead cadastrarLead(@RequestBody Lead lead){
        return leadService.salvarLead(lead);
    }

    @GetMapping()
    public List<Lead> buscarProdutos(@RequestParam String nomeProduto){
        return leadService.buscarTodosPeloNomeProduto(nomeProduto);
    }

}
