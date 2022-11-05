/******************************************************************************
 * Moovin Mensajería Express. Derechos Reservados (c) 2020.                    *
 * Creado por Alvaro Araya aaraya@moovin.me                                   *
 ******************************************************************************/
package aaj.springsecuritydbdemo.domain;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.sql.Timestamp;
import java.util.Objects;

@MappedSuperclass
public class BaseEntity {
  protected Timestamp dateCreated;
  protected Timestamp dateModified;

  @PrePersist
  @PreUpdate
  public void audit() {
    this.dateCreated = this.dateCreated == null ? new Timestamp(System.currentTimeMillis()) : this.dateCreated;
    this.dateModified = new Timestamp(System.currentTimeMillis());
  }

  @CreationTimestamp
  @Column(name = "date_created", nullable = false)
  public Timestamp getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(Timestamp dateCreated) {
    this.dateCreated = dateCreated;
  }

  @UpdateTimestamp
  @Column(name = "date_updated", nullable = false)
  public Timestamp getDateModified() {
    return dateModified;
  }

  public void setDateModified(Timestamp dateModified) {
    this.dateModified = dateModified;
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateCreated, dateModified);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseEntity that = (BaseEntity) o;
    return Objects.equals(dateCreated, that.dateCreated) && Objects.equals(dateModified, that.dateModified);
  }

  @Override
  public String toString() {
    return "BaseEntity{" +
        "dateCreated=" + dateCreated +
        ", dateModified=" + dateModified +
        '}';
  }
}
