package org.apache.cayenne.testdo.weighted_sort.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.weighted_sort.SortRoot;

/**
 * Class _SortDep was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _SortDep extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<SortRoot> ROOT = Property.create("root", SortRoot.class);

    public void setRoot(SortRoot root) {
        setToOneTarget("root", root, true);
    }

    public SortRoot getRoot() {
        return (SortRoot)readProperty("root");
    }


}
