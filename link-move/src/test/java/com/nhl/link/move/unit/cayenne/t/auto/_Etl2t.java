package com.nhl.link.move.unit.cayenne.t.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.Property;

import com.nhl.link.move.unit.cayenne.t.Etl3t;

/**
 * Class _Etl2t was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Etl2t extends BaseDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "id";

    public static final Property<String> ADDRESS = Property.create("address", String.class);
    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<List<Etl3t>> E3S = Property.create("e3s", List.class);

    protected String address;
    protected String name;

    protected Object e3s;

    public void setAddress(String address) {
        beforePropertyWrite("address", this.address, address);
        this.address = address;
    }

    public String getAddress() {
        beforePropertyRead("address");
        return this.address;
    }

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return this.name;
    }

    public void addToE3s(Etl3t obj) {
        addToManyTarget("e3s", obj, true);
    }

    public void removeFromE3s(Etl3t obj) {
        removeToManyTarget("e3s", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Etl3t> getE3s() {
        return (List<Etl3t>)readProperty("e3s");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "address":
                return this.address;
            case "name":
                return this.name;
            case "e3s":
                return this.e3s;
            default:
                return super.readPropertyDirectly(propName);
        }
    }

    @Override
    public void writePropertyDirectly(String propName, Object val) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch (propName) {
            case "address":
                this.address = (String)val;
                break;
            case "name":
                this.name = (String)val;
                break;
            case "e3s":
                this.e3s = val;
                break;
            default:
                super.writePropertyDirectly(propName, val);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        writeSerialized(out);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        readSerialized(in);
    }

    @Override
    protected void writeState(ObjectOutputStream out) throws IOException {
        super.writeState(out);
        out.writeObject(this.address);
        out.writeObject(this.name);
        out.writeObject(this.e3s);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.address = (String)in.readObject();
        this.name = (String)in.readObject();
        this.e3s = in.readObject();
    }

}
