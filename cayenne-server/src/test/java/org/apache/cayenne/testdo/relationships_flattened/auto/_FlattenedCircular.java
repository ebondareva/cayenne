package org.apache.cayenne.testdo.relationships_flattened.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.relationships_flattened.FlattenedCircular;

/**
 * Class _FlattenedCircular was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FlattenedCircular extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<List<FlattenedCircular>> SIDE1S = Property.create("side1s", List.class);
    public static final Property<List<FlattenedCircular>> SIDE2S = Property.create("side2s", List.class);

    public void addToSide1s(FlattenedCircular obj) {
        addToManyTarget("side1s", obj, true);
    }
    public void removeFromSide1s(FlattenedCircular obj) {
        removeToManyTarget("side1s", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<FlattenedCircular> getSide1s() {
        return (List<FlattenedCircular>)readProperty("side1s");
    }


    public void addToSide2s(FlattenedCircular obj) {
        addToManyTarget("side2s", obj, true);
    }
    public void removeFromSide2s(FlattenedCircular obj) {
        removeToManyTarget("side2s", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<FlattenedCircular> getSide2s() {
        return (List<FlattenedCircular>)readProperty("side2s");
    }


}