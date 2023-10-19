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
public class Link extends Component {
    public final static int CARDINALIY00 = 1;
    public final static int CARDINALIY0N = 2;
    public final static int CARDINALIY11 = 3;
    public final static int CARDINALIY1N = 4;
    
    private Entity entity;
    private Relationship relationship;
    private Integer cardinality;
    
    public Link(Entity entity, Relationship relationship, Integer cardinality) {
        this.entity = entity;
        this.relationship = relationship;
        this.cardinality = null;
    }

    public Link(Entity entity, Relationship relationship) {
        this(entity, relationship, null);
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public Relationship getRelationship() {
        return relationship;
    }

    public void setRelationship(Relationship relationship) {
        this.relationship = relationship;
    }

    public Integer getCardinality() {
        return cardinality;
    }

    public void setCardinality(Integer cardinality) {
        this.cardinality = cardinality;
    }
}
