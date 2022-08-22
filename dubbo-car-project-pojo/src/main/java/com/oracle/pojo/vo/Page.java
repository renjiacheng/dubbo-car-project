package com.oracle.pojo.vo;

import java.io.Serializable;

/**
 * @author HuangHaoD
 * @create 2022/08/04 15:22
 */
public class Page<T> implements Serializable {
    private Integer pageNums;
    private Integer pageSize;
    private Long allRow;
    private Integer totalPage;
    private T data;

    public Page() {
    }

    public Page(Integer pageNums, Integer pageSize, Long allRow, Integer totalPage, T data) {
        this.pageNums = pageNums;
        this.pageSize = pageSize;
        this.allRow = allRow;
        this.totalPage = totalPage;
        this.data = data;
    }

    public Integer getPageNums() {
        return pageNums;
    }

    public void setPageNums(Integer pageNums) {
        this.pageNums = pageNums;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getAllRow() {
        return allRow;
    }

    public void setAllRow(Long allRow) {
        this.allRow = allRow;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageNums=" + pageNums +
                ", pageSize=" + pageSize +
                ", allRow=" + allRow +
                ", totalPage=" + totalPage +
                ", data=" + data +
                '}';
    }
}