package com.demo.entity;

public class QueryVo {
    private Integer classid;
    /*private String name;
    private String cityId;
    private String orderId;*/
    // 当前页码数
    private Integer page = 1;
    // 数据库从哪一条数据开始查
    // 每页显示数据条数
    private Integer rows = 3;

    private Integer start=(this.page-1)*this.rows;

    public QueryVo() {
    }

    public QueryVo(Integer classid) {
        this.classid = classid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    /* public QueryVo(String name, String cityId, String orderId) {
                this.name = name;
                this.cityId = cityId;
                this.orderId = orderId;
            }

            public String getCityId() {
                return cityId;
            }

            public void setCityId(String cityId) {
                this.cityId = cityId;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }



            public String getOrderId() {
                return orderId;
            }

            public void setOrderId(String orderId) {
                this.orderId = orderId;
            }
        */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
        this.start=(this.page-1)*this.rows;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
        this.start=(this.page-1)*rows;
    }

   /* @Override
    public String toString() {
        return "QueryVo{" +
                "name='" + name + '\'' +
                ", cityId='" + cityId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", page=" + page +
                ", rows=" + rows +
                ", start=" + start +
                '}';
    }*/

    @Override
    public String toString() {
        return "QueryVo{" +
                "page=" + page +
                ", rows=" + rows +
                ", start=" + start +
                '}';
    }
}
