package com.cloudbees.drools;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.Map;

public class RulesCheckService {

    private KieContainer kieContainer;

    public RulesCheckService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public Map<String, Boolean> checkRules(BuildFact fact) {
        KieSession kieSession = kieContainer.newKieSession();
        RulesResult rulesResult = new RulesResult();
        kieSession.setGlobal("result", rulesResult);
        kieSession.insert(fact);
        kieSession.fireAllRules();
        kieSession.dispose();
        return rulesResult.getResults();
    }
}
