package com.dapeng.flow.workhour.pojo;

public class NodeWorkHourDoKey {
    private String id;

    private Integer wrMonth;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getWrMonth() {
        return wrMonth;
    }

    public void setWrMonth(Integer wrMonth) {
        this.wrMonth = wrMonth;
    }
}