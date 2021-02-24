package com.humaid.ws.api.service;

import com.google.gson.JsonObject;
import com.humaid.ws.api.models.Company;


public interface CompanyService {
    public Company createIfNotPresent(JsonObject companyObj);
}