package org.mvplib.model.bean;

import java.util.List;

/**
 * Author: ws.
 * Date: 2018/3/7.
 * Description: //TODO
 */

public class GoodBean extends BaseBean {


    /**
     * code : 200
     * msg : null
     * data : [{"goodsId":"5a03c44ce8cf7143b7ab27e0","goodsClassifyId":null,"goodsLabelId":null,"goodsName":"高尔夫GOLF抽绳双肩包","goodsStockNum":null,"price":990,"flag":null,"goodsOldAddress":null,"costPrice":990,"recoveryPrice":null,"goodsExplain":null,"buyerRecomContent":null,"identification":null,"groundingStatus":null,"groundingPerson":null,"groundingPersonNo":null,"groundingDatetime":null,"comment":null,"filepath":"5a03c459e8cf7143b7ab27e2.png","goodsFilesPath":null,"goodsPreRiewFilesPath":null,"bussinessType":null,"preferentialStatus":"0","stockStatus":"1"}]
     */

    private int code;
    private Object msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * goodsId : 5a03c44ce8cf7143b7ab27e0
         * goodsClassifyId : null
         * goodsLabelId : null
         * goodsName : 高尔夫GOLF抽绳双肩包
         * goodsStockNum : null
         * price : 990.0
         * flag : null
         * goodsOldAddress : null
         * costPrice : 990.0
         * recoveryPrice : null
         * goodsExplain : null
         * buyerRecomContent : null
         * identification : null
         * groundingStatus : null
         * groundingPerson : null
         * groundingPersonNo : null
         * groundingDatetime : null
         * comment : null
         * filepath : 5a03c459e8cf7143b7ab27e2.png
         * goodsFilesPath : null
         * goodsPreRiewFilesPath : null
         * bussinessType : null
         * preferentialStatus : 0
         * stockStatus : 1
         */

        private String goodsId;
        private Object goodsClassifyId;
        private Object goodsLabelId;
        private String goodsName;
        private Object goodsStockNum;
        private double price;
        private Object flag;
        private Object goodsOldAddress;
        private double costPrice;
        private Object recoveryPrice;
        private Object goodsExplain;
        private Object buyerRecomContent;
        private Object identification;
        private Object groundingStatus;
        private Object groundingPerson;
        private Object groundingPersonNo;
        private Object groundingDatetime;
        private Object comment;
        private String filepath;
        private Object goodsFilesPath;
        private Object goodsPreRiewFilesPath;
        private Object bussinessType;
        private String preferentialStatus;
        private String stockStatus;

        public String getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(String goodsId) {
            this.goodsId = goodsId;
        }

        public Object getGoodsClassifyId() {
            return goodsClassifyId;
        }

        public void setGoodsClassifyId(Object goodsClassifyId) {
            this.goodsClassifyId = goodsClassifyId;
        }

        public Object getGoodsLabelId() {
            return goodsLabelId;
        }

        public void setGoodsLabelId(Object goodsLabelId) {
            this.goodsLabelId = goodsLabelId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public void setGoodsName(String goodsName) {
            this.goodsName = goodsName;
        }

        public Object getGoodsStockNum() {
            return goodsStockNum;
        }

        public void setGoodsStockNum(Object goodsStockNum) {
            this.goodsStockNum = goodsStockNum;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public Object getFlag() {
            return flag;
        }

        public void setFlag(Object flag) {
            this.flag = flag;
        }

        public Object getGoodsOldAddress() {
            return goodsOldAddress;
        }

        public void setGoodsOldAddress(Object goodsOldAddress) {
            this.goodsOldAddress = goodsOldAddress;
        }

        public double getCostPrice() {
            return costPrice;
        }

        public void setCostPrice(double costPrice) {
            this.costPrice = costPrice;
        }

        public Object getRecoveryPrice() {
            return recoveryPrice;
        }

        public void setRecoveryPrice(Object recoveryPrice) {
            this.recoveryPrice = recoveryPrice;
        }

        public Object getGoodsExplain() {
            return goodsExplain;
        }

        public void setGoodsExplain(Object goodsExplain) {
            this.goodsExplain = goodsExplain;
        }

        public Object getBuyerRecomContent() {
            return buyerRecomContent;
        }

        public void setBuyerRecomContent(Object buyerRecomContent) {
            this.buyerRecomContent = buyerRecomContent;
        }

        public Object getIdentification() {
            return identification;
        }

        public void setIdentification(Object identification) {
            this.identification = identification;
        }

        public Object getGroundingStatus() {
            return groundingStatus;
        }

        public void setGroundingStatus(Object groundingStatus) {
            this.groundingStatus = groundingStatus;
        }

        public Object getGroundingPerson() {
            return groundingPerson;
        }

        public void setGroundingPerson(Object groundingPerson) {
            this.groundingPerson = groundingPerson;
        }

        public Object getGroundingPersonNo() {
            return groundingPersonNo;
        }

        public void setGroundingPersonNo(Object groundingPersonNo) {
            this.groundingPersonNo = groundingPersonNo;
        }

        public Object getGroundingDatetime() {
            return groundingDatetime;
        }

        public void setGroundingDatetime(Object groundingDatetime) {
            this.groundingDatetime = groundingDatetime;
        }

        public Object getComment() {
            return comment;
        }

        public void setComment(Object comment) {
            this.comment = comment;
        }

        public String getFilepath() {
            return filepath;
        }

        public void setFilepath(String filepath) {
            this.filepath = filepath;
        }

        public Object getGoodsFilesPath() {
            return goodsFilesPath;
        }

        public void setGoodsFilesPath(Object goodsFilesPath) {
            this.goodsFilesPath = goodsFilesPath;
        }

        public Object getGoodsPreRiewFilesPath() {
            return goodsPreRiewFilesPath;
        }

        public void setGoodsPreRiewFilesPath(Object goodsPreRiewFilesPath) {
            this.goodsPreRiewFilesPath = goodsPreRiewFilesPath;
        }

        public Object getBussinessType() {
            return bussinessType;
        }

        public void setBussinessType(Object bussinessType) {
            this.bussinessType = bussinessType;
        }

        public String getPreferentialStatus() {
            return preferentialStatus;
        }

        public void setPreferentialStatus(String preferentialStatus) {
            this.preferentialStatus = preferentialStatus;
        }

        public String getStockStatus() {
            return stockStatus;
        }

        public void setStockStatus(String stockStatus) {
            this.stockStatus = stockStatus;
        }
    }
}
