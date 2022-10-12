package com.dnapass.training.customermicroservice.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Payment implements Serializable {

    @Id
    private String customerNumber;

    @Id
    private String checkNumber;

    private Long paymentDate;

    private Double amount;

    public Payment() {

    }

    public Payment(String customerNumber, String checkNumber, Long paymentDate, double amount) {
        this.customerNumber = customerNumber;
        this.checkNumber = checkNumber;
        this.paymentDate = paymentDate;
        this.amount = amount;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Long getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Long paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((customerNumber == null) ? 0 : customerNumber.hashCode());
        result = prime * result + ((checkNumber == null) ? 0 : checkNumber.hashCode());
        result = prime * result + ((paymentDate == null) ? 0 : paymentDate.hashCode());
        result = prime * result + ((amount == null) ? 0 : amount.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Payment other = (Payment) obj;
        if (customerNumber == null) {
            if (other.customerNumber != null)
                return false;
        } else if (!customerNumber.equals(other.customerNumber))
            return false;
        if (checkNumber == null) {
            if (other.checkNumber != null)
                return false;
        } else if (!checkNumber.equals(other.checkNumber))
            return false;
        if (paymentDate == null) {
            if (other.paymentDate != null)
                return false;
        } else if (!paymentDate.equals(other.paymentDate))
            return false;
        if (amount == null) {
            return other.amount == null;
        } else if (!amount.equals(other.amount))
            return false;


        return true;
    }

    @Override
    public String toString() {
        return "Payment [customerNumber=" + customerNumber + ", checkNumber=" + checkNumber + ", paymentDate=" + paymentDate + ",amount="
                + amount + "]";
    }

}
