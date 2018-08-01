package com.cloudbees.drools;

import java.util.HashMap;
import java.util.Map;

public class RulesResult {

    private Map<String, Boolean> results = new HashMap<String, Boolean>();

    public Map<String, Boolean> getResults() {
        return results;
    }

    public void put(String rule, Boolean pass) {
        this.results.put(rule, pass);
    }
}
