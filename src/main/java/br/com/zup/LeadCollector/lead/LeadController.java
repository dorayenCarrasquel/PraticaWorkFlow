package br.com.zup.LeadCollector.lead;

import br.com.zup.LeadCollector.lead.Lead;
import br.com.zup.LeadCollector.lead.LeadService;
import br.com.zup.LeadCollector.lead.dtos.LeadEntradaDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leads")
public class LeadController {
  @Autowired
  private LeadService leadService;

  @Autowired
  private ModelMapper modelMapper;

  @PutMapping
  @ResponseStatus(HttpStatus.CREATED)
  public LeadEntradaDTO cadastrarLead(@RequestBody LeadEntradaDTO leadEntradaDTO) {
    Lead lead = modelMapper.map(leadEntradaDTO, Lead.class);
    leadService.salvarLead(lead);
    return modelMapper.map(lead, LeadEntradaDTO.class);
  }

}
