/* -----------------------------------------
 * Projet Titan
 *
 * Ecole Centrale Nantes
 * Jean-Yves MARTIN
 * ----------------------------------------- */
package fr.centrale.nantes.titan;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kwyhr
 */
public class Entity extends Component {
    private String name;
    private List<Link> links;
    private List<Attribute> attributes;
    
    public Entity() {
        this.name = "";
        this.attributes = new ArrayList<Attribute>();
        this.links = new ArrayList<Link>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Link> getLinks() {
        return links;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public Link addLink(Relationship relationship) {
        Link aLink = new Link(this, relationship);
        return aLink;
    }
    
    public Attribute addAttribute(String name) {
        Attribute attribute = new Attribute(this, name);
        attributes.add(attribute);
        return attribute;
    }
    
}
