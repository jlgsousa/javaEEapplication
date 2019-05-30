import artifact.JournalDAO;
import artifact.JournalsWeb;
import artifact.JournalsWebService;

public class Client {

	public static void main(String[] args) {
		JournalsWebService journalsWebService = new JournalsWebService();
		JournalsWeb journalsWeb = journalsWebService.getJournalsWebPort();
		
		for (JournalDAO journal : journalsWeb.getAllJournals()) {
			System.out.println("Title: " + journal.getTitle() + "\nDescription: " + journal.getDescription());
		}
		
	}
}
