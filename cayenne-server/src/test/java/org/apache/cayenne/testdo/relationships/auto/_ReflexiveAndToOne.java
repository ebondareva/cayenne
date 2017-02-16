package org.apache.cayenne.testdo.relationships.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.relationships.ReflexiveAndToOne;
import org.apache.cayenne.testdo.relationships.RelationshipHelper;

/**
 * Class _ReflexiveAndToOne was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ReflexiveAndToOne extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String REFLEXIVE_AND_TO_ONE_ID_PK_COLUMN = "REFLEXIVE_AND_TO_ONE_ID";

    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<List<ReflexiveAndToOne>> CHILDREN = Property.create("children", List.class);
    public static final Property<RelationshipHelper> TO_HELPER = Property.create("toHelper", RelationshipHelper.class);
    public static final Property<ReflexiveAndToOne> TO_PARENT = Property.create("toParent", ReflexiveAndToOne.class);

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void addToChildren(ReflexiveAndToOne obj) {
        addToManyTarget("children", obj, true);
    }
    public void removeFromChildren(ReflexiveAndToOne obj) {
        removeToManyTarget("children", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ReflexiveAndToOne> getChildren() {
        return (List<ReflexiveAndToOne>)readProperty("children");
    }


    public void setToHelper(RelationshipHelper toHelper) {
        setToOneTarget("toHelper", toHelper, true);
    }

    public RelationshipHelper getToHelper() {
        return (RelationshipHelper)readProperty("toHelper");
    }


    public void setToParent(ReflexiveAndToOne toParent) {
        setToOneTarget("toParent", toParent, true);
    }

    public ReflexiveAndToOne getToParent() {
        return (ReflexiveAndToOne)readProperty("toParent");
    }


}