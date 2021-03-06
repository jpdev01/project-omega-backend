package com.core.backend.entity;

import com.core.components.list.ListModule;
import com.core.components.list.isFieldList;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @isFieldList(isVisible = ListModule.ALL, label = "Nome", order = 0)
    private String name;
    @isFieldList(isVisible = ListModule.FULL, label = "Apelido", order = 1)
    private String nickname;
    @isFieldList(isVisible = ListModule.ALL, label = "CPF", order = 2)
    private String cpf;
    private String RG;
    private Date bornDate;
    private Date dateReg;
    private String email;
    private String fone;
    @isFieldList(isVisible = ListModule.FULL, label = "Telefone", order = 3)
    private String mobile;
    private String description;
    private Float credit;
    private String size;
    private String size2;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="customers_has_references", joinColumns=
    @JoinColumn(name="customer_id"), inverseJoinColumns=
    @JoinColumn(name="reference_id"))
    private List<Reference> references;

    private String office;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Address address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public Date getDateReg() {
        return dateReg;
    }

    public void setDateReg(Date dateReg) {
        this.dateReg = dateReg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getCredit() {
        return credit;
    }

    public void setCredit(Float credit) {
        this.credit = credit;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize2() {
        return size2;
    }

    public void setSize2(String size2) {
        this.size2 = size2;
    }

    public List<Reference> getReferences() {
        return references;
    }

    public void setReferences(List<Reference> references) {
        this.references = references;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

// criar implementação de família. Talvez uma classe.

}
