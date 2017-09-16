package com.training.JobScheduler.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RecordRequest {

    private List<RecordValue> values;

    @JsonProperty("values")
    public List<RecordValue> getValues() {
        return values;
    }
    @JsonProperty("values")
    public void setValues(List<RecordValue> values) {
        this.values = values;
    }
}
