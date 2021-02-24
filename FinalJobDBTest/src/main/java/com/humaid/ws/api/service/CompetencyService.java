package com.humaid.ws.api.service;

import java.util.List;
import java.util.Map;

import com.google.gson.JsonArray;
import com.humaid.ws.api.models.Competency;


public interface CompetencyService {
    public List<Competency> createCompetenciesIfNeeded(JsonArray competencyList, Integer userId);

    void deleteExistingCompetencies(Integer userId);

    public Map<Competency, Integer> getCompListForUserId(Integer userId);

}