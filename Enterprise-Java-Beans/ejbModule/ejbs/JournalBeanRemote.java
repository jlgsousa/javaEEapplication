package ejbs;

import java.util.List;

import javax.ejb.Remote;

import dao.JournalDAO;

@Remote
public interface JournalBeanRemote {
	
	List<String> allTitles();
	
	List<JournalDAO> allJournals();
	
	List<JournalDAO> allJournalsOrdered(String attribute, String order);
	
	JournalDAO infoJournal(String title);

}