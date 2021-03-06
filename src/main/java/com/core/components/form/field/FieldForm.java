package com.core.components.form.field;

import com.core.components.utils.WebComponent;

public abstract class FieldForm {
    private String id;
    private String label;
    private Integer group;
    private FieldFormType fieldType;
    private WebComponent webComponent;

    public FieldForm(String id, String label, Integer group)
    {
        this.setId(id);
        this.setLabel(label);
        this.setGroup(group);
    }

    public FieldForm(String id, String label, Integer group, FieldFormType type)
    {
        this.setId(id);
        this.setLabel(label);
        this.setGroup(group);
        this.fieldType = type;
    }

    public FieldForm(String id, String label, Integer group, FieldFormType type, WebComponent webComponent)
    {
        this.setId(id);
        this.setLabel(label);
        this.setGroup(group);
        this.fieldType = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public FieldFormType getFieldType() {
        return fieldType;
    }

    public void setFieldType(FieldFormType fieldType) {
        this.fieldType = fieldType;
    }

    public WebComponent getWebComponent() {
        return webComponent;
    }

    public void setWebComponent(WebComponent webComponent) {
        this.webComponent = webComponent;
    }
}
