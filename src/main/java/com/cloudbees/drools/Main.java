package com.cloudbees.drools;

import java.util.Map;

public class Main {

    public static final void main(String [] args) {

        RulesCheckService service = new RulesCheckService(RulesConfiguration.kieContainer());

        for (int i = 0; i < 100; i++) {
            Map<String, Boolean> result = service.checkRules(new BuildFact(Math.random() < 0.5, Math.random() * 100));
            System.out.println(result);
        }

    }
}
