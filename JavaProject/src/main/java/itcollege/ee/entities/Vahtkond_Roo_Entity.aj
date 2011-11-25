// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package itcollege.ee.entities;

import itcollege.ee.entities.Vahtkond;
import java.lang.Integer;
import java.lang.Long;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Version;
import org.springframework.transaction.annotation.Transactional;

privileged aspect Vahtkond_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager Vahtkond.entityManager;
    
    @Version
    @Column(name = "version")
    private Integer Vahtkond.version;
    
    public Integer Vahtkond.getVersion() {
        return this.version;
    }
    
    public void Vahtkond.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void Vahtkond.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Vahtkond.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Vahtkond attached = Vahtkond.findVahtkond(this.Id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Vahtkond.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Vahtkond.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Vahtkond Vahtkond.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Vahtkond merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager Vahtkond.entityManager() {
        EntityManager em = new Vahtkond().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Vahtkond.countVahtkonds() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Vahtkond o", Long.class).getSingleResult();
    }
    
    public static List<Vahtkond> Vahtkond.findAllVahtkonds() {
        return entityManager().createQuery("SELECT o FROM Vahtkond o", Vahtkond.class).getResultList();
    }
    
    public static Vahtkond Vahtkond.findVahtkond(Long Id) {
        if (Id == null) return null;
        return entityManager().find(Vahtkond.class, Id);
    }
    
    public static List<Vahtkond> Vahtkond.findVahtkondEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Vahtkond o", Vahtkond.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
