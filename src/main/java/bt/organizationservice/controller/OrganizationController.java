package bt.organizationservice.controller;

import bt.organizationservice.model.Organization;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/organization")
public class OrganizationController {

    @GetMapping("/{id}")
    public Organization getOrganizationById(@PathVariable("id") long organizationId){
        return new Organization(organizationId, "Lenovo", "China");
    }

}