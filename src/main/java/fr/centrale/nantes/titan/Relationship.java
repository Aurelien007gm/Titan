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
public class Relationship extends Component {
    private String name;
    private List<Link> links;
    
    public Relationship() {
        this.name = "";
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

    public void setLinks(List<Link> links) {
        this.links = links;
    }
    
    public Link addLink(Entity entity) {
        Link aLink = new Link(entity, this);
        return aLink;
    }

}
