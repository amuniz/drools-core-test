package com.cloudbees.drools;

public class BuildFact {

    private boolean hasTests;
    private double coverage;

    public BuildFact(boolean hasTests, double coverage) {
        this.hasTests = hasTests;
        this.coverage = coverage;
    }

    public boolean isHasTests() {
        return hasTests;
    }

    public void setHasTests(boolean hasTests) {
        this.hasTests = hasTests;
    }

    public double getCoverage() {
        return coverage;
    }

    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }
}
