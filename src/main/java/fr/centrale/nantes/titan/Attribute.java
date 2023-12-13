/* -----------------------------------------
 * Projet Titan
 *
 * Ecole Centrale Nantes
 * Jean-Yves MARTIN
 * ----------------------------------------- */
package fr.centrale.nantes.titan;

import java.awt.Component;

/**
 *
 * @author kwyhr
 */
public class Attribute {

    private Component parent;

    private String name;
    private String dataType;
    private Integer dataSize;

    private boolean inIdentifier;
    private boolean autoIncrement;
    private boolean isNull;
    private String defaultValue;

    public Attribute(Component parent, String name) {
        this.parent = parent;
        this.name = name;
        this.dataType = null;
        this.dataSize = null;
        this.inIdentifier = false;
        this.autoIncrement = false;
        this.isNull = true;
        this.defaultValue = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Integer getDataSize() {
        return dataSize;
    }

    public void setDataSize(Integer dataSize) {
        this.dataSize = dataSize;
    }

    public boolean isInIdentifier() {
        return inIdentifier;
    }

    public void setInIdentifier(boolean inIdentifier) {
        this.inIdentifier = inIdentifier;
        if (inIdentifier) {
            this.setIsNull(false);
        } else {
            this.setAutoIncrement(false);
        }
    }

    public boolean isAutoIncrement() {
        return autoIncrement;
    }

    public void setAutoIncrement(boolean autoIncrement) {
        if (autoIncrement) {
            if (this.inIdentifier) {
                this.autoIncrement = autoIncrement;
            }
        } else {
            this.autoIncrement = autoIncrement;
        }
    }

    public boolean isIsNull() {
        return isNull;
    }

    public void setIsNull(boolean isNull) {
        this.isNull = isNull;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Component getParent() {
        return parent;
    }
    
   public void show() {
        System.out.println(name);
    }

}
