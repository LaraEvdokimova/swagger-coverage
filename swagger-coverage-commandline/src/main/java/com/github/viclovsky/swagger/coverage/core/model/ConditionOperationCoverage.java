package com.github.viclovsky.swagger.coverage.core.model;

import io.swagger.models.Operation;

import java.util.List;

public class ConditionOperationCoverage {

    private Operation operation;
    private List<Condition> conditions;
    protected long processCount = 0;

    public Operation getOperation() {
        return operation;
    }

    public ConditionOperationCoverage setOperation(Operation operation) {
        this.operation = operation;
        return this;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public ConditionOperationCoverage setConditions(List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public long getProcessCount() {
        return processCount;
    }

    public ConditionOperationCoverage setProcessCount(long processCount) {
        this.processCount = processCount;
        return this;
    }

    public ConditionOperationCoverage increaseProcessCount(){
        this.processCount++;
        return this;
    }
}
