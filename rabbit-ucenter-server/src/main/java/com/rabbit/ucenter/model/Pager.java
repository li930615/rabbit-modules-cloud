package com.rabbit.ucenter.model;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName Pager
 * @Description TODO
 * @Author LZQ
 * @Date 2019/1/29 22:10
 **/
public class Pager<T> implements Serializable {

    private static final long serialVersionUID = 2621330343032703770L;
    public static final Integer MAX_PAGE_SIZE = Integer.valueOf(500);

    private Boolean usePager = Boolean.valueOf(true);
    private int offset = 0;
    private int start = 0;
    private int page = 1;
    private int limit = 10;
    private String order;
    private String orderByField;
    private Long total;
    private List<T> rows;
    private volatile int draw = 0;

    public int getStart() {
        return this.start;
    }

    public void setStart(int start) {
        this.start = start;
        this.offset = start;
    }

    public int getDraw() {
        return ++this.draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getPage() {
        return this.page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getOffset() {
        return this.offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return this.limit;
    }

    public void setLimit(int limit) {
        if (limit > MAX_PAGE_SIZE.intValue()) {
            limit = MAX_PAGE_SIZE.intValue();
        }
        this.limit = limit;
    }

    public String getSort() {
        StringBuilder result = new StringBuilder();
        if ((this.orderByField != null) && (this.orderByField.length() > 0))
        {
            result.append(this.orderByField.substring(0, 1).toUpperCase());

            for (int i = 1; i < this.orderByField.length(); i++) {
                String s = this.orderByField.substring(i, i + 1);

                if ((s.equals(s.toUpperCase())) && (!Character.isDigit(s.charAt(0))) && (Character.isLetter(s.charAt(0)))) {
                    result.append("_");
                }

                result.append(s.toUpperCase());
            }
        } else {
            return null;
        }
        return result.toString().toLowerCase();
    }

    public Long getTotal() {
        return this.total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return this.rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public String getOrderByField() {
        return this.orderByField;
    }

    public void setOrderByField(String orderByField) {
        this.orderByField = orderByField;
    }

    public Boolean getUsePager() {
        return this.usePager;
    }

    public void setUsePager(Boolean usePager) {
        this.usePager = usePager;
    }

    public String getOrder() {
        return this.order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
