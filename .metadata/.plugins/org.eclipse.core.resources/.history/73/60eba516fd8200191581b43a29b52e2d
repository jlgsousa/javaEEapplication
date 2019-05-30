package dao;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "JOURNALDB")
public class JournalDAO implements Serializable {

    private static final long serialVersionUID = 1L;

	//JournalDAO titles are considered to be unique
	@Id
	@Column(name="Pub_TitleID")
	private String title;
	private String authors;
	private String date;
	private String conference;
	private String journal;
	private String volume;
	private String issue;
	private String pages;
	private String publisher;
	private String description;
	private String scholarArtic;
	private int citationNumber;

	public JournalDAO() {
	}

	public JournalDAO(String title, String authors, String date, String conference, String journal, String volume, String issue, String pages, String publisher, String description, String scholarArtic, int citationNumber) {
		this.title = title;
		this.authors = authors;
		this.date = date;
		this.conference = conference;
		this.journal = journal;
		this.volume = volume;
		this.issue = issue;
		this.pages = pages;
		this.publisher = publisher;
		this.description = description;
		this.scholarArtic = scholarArtic;
		this.citationNumber = citationNumber;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getConference() {
		return conference;
	}

	public void setConference(String conference) {
		this.conference = conference;
	}

	public String getJournal() {
		return journal;
	}

	public void setJournal(String journal) {
		this.journal = journal;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getScholarArtic() {
		return scholarArtic;
	}

	public void setScholarArtic(String scholarArtic) {
		this.scholarArtic = scholarArtic;
	}

	public int getCitationNumber() {
		return citationNumber;
	}

	public void setCitationNumber(int citationNumber) {
		this.citationNumber = citationNumber;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (title != null ? title.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof JournalDAO)) {
			return false;
		}
		JournalDAO other = (JournalDAO) object;
		return (this.title != null || other.title == null)
				&& (this.title == null || this.title.equals(other.title));
	}

	@Override
	public String toString() {
		return "Publicacao '" + title + "':\n" + authors + "\n" + date + "\n" + conference
				+ "\n" + journal + "\n" + volume + "\n" + issue + "\n" + pages + "\n" + publisher
				+ "\n" + description + "\n" + scholarArtic + "\n" + citationNumber;
	}
}