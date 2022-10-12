package com.dnapass.training.customermicroservice.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    private Long customerNumber;

    @Id
    private String customerName;

    private String contactLastName;

    private String contactFirstName;

    private Long phoneNumber;

    private String addressLine1;

    private String addressLine2;

    private String city;

    private String state;

    private Long postalCode;

    private String country;

    private Long salesRepEmployeeNumber;

    private Double creditLimit;

    public Customer() {

    }

    public Customer(Long customerNumber, String customerName, String contactLastName, String contactFirstName, Long phoneNumber,
                    String addressLine1, String addressLine2, String city, String state, Long postalCode, String country, Long salesRepEmployeeNumber,
                    Double creditLimit) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.contactFirstName = contactFirstName;
        this.contactLastName = contactLastName;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.creditLimit = creditLimit;
        this.phoneNumber = phoneNumber;
        this.salesRepEmployeeNumber = salesRepEmployeeNumber;
        this.postalCode = postalCode;
        this.country = country;
    }

    public Long getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Long customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Long postalCode) {
        this.postalCode = postalCode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public Long getSalesRepEmployeeNumber() {
        return salesRepEmployeeNumber;
    }

    public void setSalesRepEmployeeNumber(Long salesRepEmployeeNumber) {
        this.salesRepEmployeeNumber = salesRepEmployeeNumber;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((customerNumber == null) ? 0 : customerNumber.hashCode());
        result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
        result = prime * result + ((contactLastName == null) ? 0 : contactLastName.hashCode());
        result = prime * result + ((contactFirstName == null) ? 0 : contactFirstName.hashCode());
        result = prime * result + ((addressLine1 == null) ? 0 : addressLine1.hashCode());
        result = prime * result + ((addressLine2 == null) ? 0 : addressLine2.hashCode());
        result = prime * result + ((state == null) ? 0 : state.hashCode());
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((country == null) ? 0 : country.hashCode());
        result = prime * result + ((postalCode == null) ? 0 : postalCode.hashCode());
        result = prime * result + ((salesRepEmployeeNumber == null) ? 0 : salesRepEmployeeNumber.hashCode());
        result = prime * result + ((creditLimit == null) ? 0 : creditLimit.hashCode());
        result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
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
        Customer other = (Customer) obj;
        if (customerNumber == null) {
            if (other.customerNumber != null)
                return false;
        } else if (!customerNumber.equals(other.customerNumber))
            return false;
        if (customerName == null) {
            if (other.customerName != null)
                return false;
        } else if (!customerName.equals(other.customerName))
            return false;
        if (contactLastName == null) {
            if (other.contactLastName != null)
                return false;
        } else if (!contactLastName.equals(other.contactLastName))
            return false;
        if (contactFirstName == null) {
            return other.contactFirstName == null;
        } else if (!contactFirstName.equals(other.contactFirstName))
            return false;
        if (addressLine1 == null) {
            if (other.addressLine1 != null)
                return false;
        } else if (!addressLine2.equals(other.addressLine2))
            return false;
        if (phoneNumber == null) {
            if (other.phoneNumber != null)
                return false;
        } else if (!phoneNumber.equals(other.phoneNumber))
            return false;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        if (state == null) {
            return other.state == null;
        } else if (!state.equals(other.state))
            return false;
        if (postalCode == null) {
            if (other.postalCode != null)
                return false;
        } else if (!postalCode.equals(other.postalCode))
            return false;
        if (country == null) {
            if (other.country != null)
                return false;
        } else if (!country.equals(other.country))
            return false;
        if (salesRepEmployeeNumber == null) {
            if (other.salesRepEmployeeNumber != null)
                return false;
        } else if (!salesRepEmployeeNumber.equals(other.salesRepEmployeeNumber))
            return false;
        if (creditLimit == null) {
            return other.creditLimit == null;
        } else if (!creditLimit.equals(other.creditLimit))
            return false;
        return true;


    }

    @Override
    public String toString() {
        return "Customer [customerNumber=" + customerNumber + ", customerName=" + customerName + ", contactLastName=" + contactLastName + ",contactFirstName="
                + contactFirstName + ",phoneNumber=" + phoneNumber + ",addressLine1=" + addressLine1 + ",addressLine2=" + addressLine1 + ",city=" + city + ",state=" + state + ",postalCode = " + postalCode + ",country = " + country + ",salesRepEmployeeNumber = " + salesRepEmployeeNumber + ",creditLimit = " + creditLimit + "]";

    }

}
