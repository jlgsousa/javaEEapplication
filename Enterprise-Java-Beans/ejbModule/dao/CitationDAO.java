package dao;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CITATIONDB")
public class CitationDAO implements Serializable {

	private static final long serialVersionUID = 2L;

	@Id
	@Column(name="Pub_TitleID")
	private Long id;
	private String title;

	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="Ligacao")
	private List<CitationChicagoDAO> chicago = new ArrayList<>();

	public CitationDAO() {
	}

	public CitationDAO(String title, Long id) {
		this.title = title;
		this.id = id;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<CitationChicagoDAO> getChicago() {
		return chicago;
	}

	public void setChicago(List<CitationChicagoDAO> chicago) {
		this.chicago = chicago;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (title != null ? title.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof CitationDAO)) {
			return false;
		}
		CitationDAO other = (CitationDAO) object;
		return (this.title != null || other.title == null)
				&& (this.title == null || this.title.equals(other.title));
	}

	@Override
	public String toString() {
		return "Citation '" + title + "'";
	}
}