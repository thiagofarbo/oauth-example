package com.example.oauth.resource;

import com.example.oauth.domain.Company;
import com.example.oauth.service.CompanyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Api(value = "/companies", produces = "application/json;charset=UTF-8", tags = { "Company" })
@ApiOperation(value = "companies", notes = "Company API", response = CompanyResource.class)
@ApiResponses({
        @ApiResponse(code = 200, message = ""),
        @ApiResponse(code = 403, message = ""),
        @ApiResponse(code = 404, message = ""),
        @ApiResponse(code = 500, message = "") })
public class CompanyResource {

    @Autowired
    private CompanyService companyService;

    @ResponseBody
    @PostMapping("/companies")
    private ResponseEntity<Company> create(@RequestBody final Company company){
        return ResponseEntity.ok(this.companyService.create(company));
    }

    @GetMapping("/companies/{id}")
    public ResponseEntity<Company> findById(@PathVariable final String id){
        return ResponseEntity.ok(this.companyService.find(id));
    }

}
