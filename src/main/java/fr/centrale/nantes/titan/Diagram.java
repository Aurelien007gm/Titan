/* -----------------------------------------
 * Projet Titan
 *
 * Ecole Centrale Nantes
 * Jean-Yves MARTIN
 * ----------------------------------------- */
package fr.centrale.nantes.titan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kwyhr
 */
public class Diagram {
    
    private List<Entity> entities;
    private List<Relationship> relations;
    
    public void createNewDiagram(){
        System.out.println("Create new file");
        // TODO Erase current diagram and create new empty one
    }
    
    public void saveDiagram(){
        // TODO Save this diagram
        System.out.println("Save file");
    }
     
    public void saveAsDiagram(){
        // TODO Save this diagram
        System.out.println("Save file as");
    }
    
    public void createSampleDiagram(){
        entities = new ArrayList<>();
        Entity cours = new Entity();
        cours.setName("Cours");
        cours.addAttribute("Nom");
        cours.addAttribute("Salle");
        cours.addAttribute("EstOption");
        cours.addAttribute("Semestre");
        entities.add(cours);
        
        System.out.println("Sample created");
        
    }
    
    public void createSampleDiagram2(){
        entities = new ArrayList<Entity>();
        relations = new ArrayList<Relationship>();
        Entity cours = new Entity();
        cours.setName("Cours");
        cours.addAttribute("Nom");
        cours.addAttribute("Salle");
        
        Entity teacher = new Entity();
        teacher.setName("Enseignant");
        cours.addAttribute("Nom");
        cours.addAttribute("Prénom");
        
        entities.add(cours);
        entities.add(teacher);
        
        System.out.println("Sample created");
        
        
    
    }
    
    public void createTestRelationship(){
        Relationship relation = new Relationship();
        relation.setName("Enseigne");
        
        List<Link> links = new ArrayList<Link>();
       
        for (Entity e : entities){
           Link l = relation.addLink(e);
           links.add(l);
        }
        relation.setLinks(links);
        System.out.println("Relation created");
        relations.add(relation);
        
    }
    
    public void show(){
        for (Entity e: entities){
            e.show();
        }
    }
    

    
    public List<Entity> getEntities() {
        return entities;
    }
     
     
    
}
