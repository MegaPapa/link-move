package com.nhl.link.move.unit.cayenne.t.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _Etl1t was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Etl1t extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "id";

    public static final Property<Integer> AGE = new Property<Integer>("age");
    public static final Property<String> DESCRIPTION = new Property<String>("description");
    public static final Property<String> NAME = new Property<String>("name");

    public void setAge(Integer age) {
        writeProperty("age", age);
    }
    public Integer getAge() {
        return (Integer)readProperty("age");
    }

    public void setDescription(String description) {
        writeProperty("description", description);
    }
    public String getDescription() {
        return (String)readProperty("description");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

}
