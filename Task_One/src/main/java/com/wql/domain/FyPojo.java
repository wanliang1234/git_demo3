package com.wql.domain;

import lombok.Data;

import java.util.List;

@Data
public class FyPojo
{
    private Integer current;//当前页码
    private List<WorkPojo> records;//当前数据总数
    private Integer pages;//总页数
    private Integer size;//当前页数记录数；
    private Integer total;//总记录数

    public FyPojo() {
    }

    public FyPojo(Integer current, List<WorkPojo> records, Integer pages, Integer size, Integer total) {
        this.current = current;
        this.records = records;
        this.pages = pages;
        this.size = size;
        this.total = total;
    }
}
